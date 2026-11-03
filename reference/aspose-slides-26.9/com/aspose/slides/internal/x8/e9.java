package com.aspose.slides.internal.x8;

public class e9 extends i1 {
   public e9() {
      super("out-of-range");
   }

   @Override
   public boolean n5(com.aspose.slides.internal.j3.z3 var1, String var2) {
      if (!n5(var1)) {
         return false;
      }

      if (!n5(var1, "type", "number")) {
         return false;
      }

      if (!var1.t2("value")) {
         return false;
      }

      int var3 = 0;
      int var4 = 0;
      int var5 = 0;
      String var6 = var1.u3("value");
      int[] var7 = new int[]{0};
      boolean var8 = !com.aspose.slides.ms.System.a3.n5(var6, var7);
      var3 = var7[0];
      if (var8) {
         return false;
      }

      if (var1.t2("min")) {
         var6 = var1.u3("min");
         int[] var9 = new int[]{0};
         boolean var10 = !com.aspose.slides.ms.System.a3.n5(var6, var9);
         var4 = var9[0];
         if (var10) {
            var4 = Integer.MIN_VALUE;
         }
      } else {
         var4 = Integer.MIN_VALUE;
      }

      if (var1.t2("max")) {
         var6 = var1.u3("max");
         int[] var16 = new int[]{0};
         boolean var17 = !com.aspose.slides.ms.System.a3.n5(var6, var16);
         var5 = var16[0];
         if (var17) {
            var5 = Integer.MAX_VALUE;
         }
      } else {
         var5 = Integer.MAX_VALUE;
      }

      return var3 < var4 || var5 < var3;
   }
}
