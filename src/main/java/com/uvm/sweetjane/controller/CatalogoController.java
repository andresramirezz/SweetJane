/**
 * @author Andres Ramirez
 * File: CatalogoController.java
 * Date 02/29/2020
 * 
 */

package com.uvm.sweetjane.controller;

import java.io.BufferedOutputStream;
import java.io.FileOutputStream;
import java.util.List;

import javax.servlet.http.HttpServletRequest;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.multipart.MultipartFile;

import com.uvm.sweetjane.model.PastelCatalogo;
import com.uvm.sweetjane.service.PastelCatalogoService;

@Controller
public class CatalogoController {
	
	
	@Autowired
	private PastelCatalogoService bikeCatalogService;

	@RequestMapping ( value = "/agregarProducto", method=RequestMethod.GET )
	public String agregarProducto ( Model model ) {
		PastelCatalogo bc = new PastelCatalogo();
		model.addAttribute("pastel_catalogo", bc);
		return "agregarProducto";
	}

	@RequestMapping ( value = "/agregarProducto", method=RequestMethod.POST )
	public String addBikePost 
		(@ModelAttribute ("pastel_catalogo") PastelCatalogo bc, HttpServletRequest request) {
		bikeCatalogService.save (bc);
		
		MultipartFile imagenPastel = bc.getImagenPastel();
		
				try {
					byte[] bytes = imagenPastel.getBytes();
					String name = bc.getId()+".png";
					BufferedOutputStream stream = new BufferedOutputStream 
						(new FileOutputStream("src/main/resources/static/img/producto/"+name));
					stream.write(bytes);
					stream.close();
				} catch (Exception e) {
					e.printStackTrace();
				}
		
		return "redirect:catalogoProducto";
	}

	@RequestMapping ( "/bikeList" )
	public String bikeList ( Model model ) {
		List<PastelCatalogo> bikeList = bikeCatalogService.findAll();
		model.addAttribute("bikeList", bikeList);
		
		return "bikeList";
	}
	
	@RequestMapping ( "/catalogoProducto" )
	public String bikeshelf ( Model model ) {
		List<PastelCatalogo> bikeshelf = bikeCatalogService.findAll();
		model.addAttribute("bikeList", bikeshelf);
		
		return "catalogoProducto";
	}
}