package lightningsticks.me.buryings.lightningsticks.me.buryings.annotations;

import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;

    @Retention(RetentionPolicy.RUNTIME)
    public @interface Permission {
        String value();
    }
