package com.aspose.slides;

final class e5 implements IAlphaInverseEffectiveData, t9f {
   static final e5 n5 = new e5();

   private e5() {
   }

   @Override
   public final String n5() {
      return com.aspose.slides.ms.System.j8.n5(this).s7();
   }

   @Override
   public final c0v n5(c0v var1) {
      for (int var2 = 0; var2 < var1.a6().length; var2 += 4) {
         var1.a6()[var2 + 3] = (byte)(255 - (var1.a6()[var2 + 3] & 255));
      }

      return var1;
   }

   @Override
   public final void n5(IBaseSlide var1, w6a var2) {
   }
}
