public record ExchangeRate(
        String result,
        String time_last_update_utc,
        String base_code,
        String target_code,
        float conversion_rate
        /*String result,
        String time_last_update_utc,
        String base_code,
        Object conversion_rates*/
        ) {
}
