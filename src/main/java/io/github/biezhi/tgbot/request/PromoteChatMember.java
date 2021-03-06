package io.github.biezhi.tgbot.request;

import io.github.biezhi.tgbot.response.BotResponse;

/**
 * Stas Parshin
 * 01 July 2017
 */
public class PromoteChatMember extends BotRequest<PromoteChatMember, BotResponse> {

    public PromoteChatMember(Object chatId, int userId) {
        super(BotResponse.class);
        add("chat_id", chatId).add("user_id", userId);
    }

    public PromoteChatMember canChangeInfo(boolean canChangeInfo) {
        return add("can_change_info", canChangeInfo);
    }

    public PromoteChatMember canPostMessages(boolean canPostMessages) {
        return add("can_post_messages", canPostMessages);
    }

    public PromoteChatMember canEditMessages(boolean canEditMessages) {
        return add("can_edit_messages", canEditMessages);
    }

    public PromoteChatMember canDeleteMessages(boolean canDeleteMessages) {
        return add("can_delete_messages", canDeleteMessages);
    }

    public PromoteChatMember canRestrictMembers(boolean canRestrictMembers) {
        return add("can_restrict_members", canRestrictMembers);
    }

    public PromoteChatMember canPinMessages(boolean canPinMessages) {
        return add("can_pin_messages", canPinMessages);
    }

    public PromoteChatMember canPromoteMembers(boolean canPromoteMembers) {
        return add("can_promote_members", canPromoteMembers);
    }
}
