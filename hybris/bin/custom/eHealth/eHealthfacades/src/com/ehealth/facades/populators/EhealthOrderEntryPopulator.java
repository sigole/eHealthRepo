/**
 *
 */
package com.ehealth.facades.populators;

import de.hybris.platform.commercefacades.order.converters.populator.OrderEntryPopulator;
import de.hybris.platform.commercefacades.order.data.OrderEntryData;
import de.hybris.platform.core.model.order.AbstractOrderEntryModel;
import de.hybris.platform.core.model.order.CartEntryModel;
import de.hybris.platform.core.model.order.OrderEntryModel;
import de.hybris.platform.servicelayer.dto.converter.ConversionException;

import java.util.List;


/**
 * @author SIGOLE
 *
 */
public class EhealthOrderEntryPopulator extends OrderEntryPopulator
{
	@Override
	public void populate(final AbstractOrderEntryModel source, final OrderEntryData target) throws ConversionException
	{
		// YTODO Auto-generated method stub
		super.populate(source, target);
		List<String> orderEntryList = null;
		List<String> cartEntryList = null;
		if (source instanceof OrderEntryModel)
		{
			orderEntryList = ((OrderEntryModel) source).getOrderedAddons();
			target.setOrderAddons(orderEntryList);
		}

		if (source instanceof CartEntryModel)
		{
			cartEntryList = ((CartEntryModel) source).getCartAddons();
			target.setOrderAddons(cartEntryList);
		}

	}
}
