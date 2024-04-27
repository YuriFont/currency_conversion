package models;

import java.util.Map;

public record ExchangeInfo(String result, String documentation, String termsOfUse, long timeLastUpdateUnix, String timeLastUpdateUtc, long timeNextUpdateUnix, String timeNextUpdateUtc, String baseCode) {
}
