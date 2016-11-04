package com.szogibalu.annotations;

import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

import org.junit.jupiter.api.Tag;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;

import com.szogibalu.extensions.DisabledForTheMeetupExtension;

@Target({ ElementType.TYPE, ElementType.METHOD })
@Retention(RetentionPolicy.RUNTIME)
@Tag("java_meetup")
@Test
@ExtendWith(DisabledForTheMeetupExtension.class)
public @interface DisabledForTheMeetup {

}
