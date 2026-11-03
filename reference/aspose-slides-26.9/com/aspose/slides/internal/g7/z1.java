package com.aspose.slides.internal.g7;

public abstract class z1 extends t9 {
   private u7 a6;

   protected z1(u7 var1, z1 var2) {
      super(var2, var1.n5());
      this.a6 = var1;
      if (var1.n5() == null) {
         throw new f9d(
            com.aspose.slides.ms.System.d1.n5(
               "The parser {0} could not start because parsing content is empty", new Object[]{com.aspose.slides.ms.System.j8.n5(this).s7()}
            )
         );
      }
   }

   public final u7 z1() {
      return this.a6;
   }

   @Override
   public void l6(int var1, int[] var2) {
      try {
         super.l6(var1, var2);
      } catch (RuntimeException var4) {
         throw new f9d(
            com.aspose.slides.ms.System.d1.n5(
               "Error happened during parsing {0}",
               new Object[]{com.aspose.slides.ms.System.d1.n5(new String[]{com.aspose.slides.ms.System.j8.n5(this).s7(), new y9().n5(this)})}
            ),
            var4
         );
      }
   }
}
