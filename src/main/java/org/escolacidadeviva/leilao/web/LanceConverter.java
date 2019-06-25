package org.escolacidadeviva.leilao.web;

import javax.faces.component.UIComponent;
import javax.faces.context.FacesContext;
import javax.faces.convert.Converter;
import javax.faces.convert.FacesConverter;

import org.escolacidadeviva.leilao.lance.Lance;


@FacesConverter(value = "lanceConverter")
public class LanceConverter implements Converter {

	@Override
	public Object getAsObject(FacesContext context, UIComponent component, String value) {
		if (value != null && value.trim().length() > 0) {
			return (Lance) component.getAttributes().get(value);
		}
		return null;
	}

	@Override
	public String getAsString(FacesContext context, UIComponent component, Object value) {
		if (value instanceof Lance) {
			Lance entity = (Lance) value;
			
			if(entity != null && entity instanceof Lance && entity.getId_img() != null) {
				component.getAttributes().put(entity.getId_img().toString(), entity);
				return entity.getId_img().toString();
				}
		}
		return "";
	}
}
