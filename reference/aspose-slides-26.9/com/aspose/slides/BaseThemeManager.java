package com.aspose.slides;

public abstract class BaseThemeManager implements r0g {
   static final m0l n5 = new m0l();
   private final m0l l6;
   private final r0g k5;

   abstract m0l k5();

   final m0l u3() {
      return this.l6;
   }

   BaseThemeManager(r0g parentImmediate) {
      this.k5 = parentImmediate;
      this.l6 = new m0l();
   }

   @Override
   public final r0g getParent_Immediate() {
      return this.k5;
   }
}
