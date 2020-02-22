package uk.ac.ebi.spot.gwas.deposition.messaging.adapter;

/**
 * Spring service bean Factory for retrieving the adapter.
 *
 * @author Udo Held
 */

public interface MessagingAdapterFactory {

    MessagingAdapter getAdapter(final String adapter);
}
