package com.goldin.plugins.teamcity.messenger.impl

import com.goldin.plugins.teamcity.messenger.api.MessagesConfiguration
import com.goldin.plugins.teamcity.messenger.api.MessagesContext
import org.gcontracts.annotations.Requires

/**
 * {@link MessagesConfiguration} implementation
 */
class MessagesConfigurationImpl implements MessagesConfiguration
{
    final MessagesContext context

    @Requires({ context })
    MessagesConfigurationImpl ( MessagesContext context )
    {
        this.context = context
    }

    
    @Override
    int getAjaxRequestInterval () { 20 }

    @Override
    int getPersistencyInterval () { 600 }

    @Override
    int getMessagesLimitPerUser () { 100 }

    @Override
    int getMessageLengthLimit () { 100 }

    @Override
    String getDateFormatPattern () { 'EEEEEEE, MMMMMM dd, yyyy' } // "Wed, Jun 15, 2011"

    @Override
    String getTimeFormatPattern () { 'HH:mm' }                    // "17:03"
}

