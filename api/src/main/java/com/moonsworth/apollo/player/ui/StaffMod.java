package com.moonsworth.apollo.player.ui;

import lombok.Value;

import java.util.EnumSet;
import java.util.Set;

/**
 * Represents a staff mod that can be enabled on the client.
 *
 * @since 1.0.0
 */
@Value(staticConstructor = "of")
public class StaffMod {

    /**
     * Returns a {@link Set} of {@link Module}s.
     *
     * @return the module set
     * @since 1.0.0
     */
    Set<Module> modules;

    /**
     * Represents the staff module.
     *
     * @since 1.0.0
     */
    public enum Module {
        XRAY;

        private static final Set<Module> MODULE_CACHE = EnumSet.allOf(Module.class);

        public static Set<Module> getModules() {
            return Module.MODULE_CACHE;
        }
    }
}
