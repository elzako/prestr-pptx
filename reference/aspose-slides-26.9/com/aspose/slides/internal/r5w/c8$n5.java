package com.aspose.slides.internal.r5w;

import java.awt.RenderingHints.Key;

public class c8$n5 extends Key {
   private final String n5;

   private c8$n5(int var1, String var2) {
      super(var1);
      this.n5 = var2;
   }

   @Override
   public boolean isCompatibleValue(Object val) {
      return val instanceof Number;
   }

   @Override
   public String toString() {
      return this.n5;
   }

   // Restored original synthetic constructor delegation: (ILjava/lang/String;Lcom/aspose/slides/internal/r5w/t2;)V -> (ILjava/lang/String;)V
   c8$n5(int recoveredArg0, java.lang.String recoveredArg1, com.aspose.slides.internal.r5w.t2 recoveredArg2) {
      this(recoveredArg0, recoveredArg1);
   }
}
