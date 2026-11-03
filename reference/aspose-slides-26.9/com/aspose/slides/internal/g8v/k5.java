package com.aspose.slides.internal.g8v;

class k5 implements d5 {
   @Override
   public l6 n5(String var1, b5 var2, f2 var3) {
      if (var3 != null && var1 != null) {
         String var4 = com.aspose.slides.ms.System.d1.l6(var1);
         return com.aspose.slides.ms.System.d1.u9(com.aspose.slides.ms.System.d1.u9(var4), "basic", (short)4) == -1 ? null : n5(var2, var3);
      } else {
         return null;
      }
   }

   static byte[] n5(String var0) {
      int var1 = var0.length();
      byte[] var2 = new byte[var1];
      var1--;

      while (var1 >= 0) {
         var2[var1] = com.aspose.slides.internal.v6g.k5.n5((Object)(var0.charAt(var1)), 4);
         var1--;
      }

      return var2;
   }

   static l6 n5(b5 var0, f2 var1) {
      w1 var2 = com.aspose.slides.internal.v6g.k5.n5(var0, w1.class);
      if (var2 != null && var1 != null) {
         a5 var3 = var1.n5(var2.m1(), "basic");
         if (var3 == null) {
            return null;
         }

         String var4 = var3.l6();
         if (var4 != null && !"".equals(var4)) {
            String var5 = var3.k5();
            String var6 = var3.n5();
            byte[] var7;
            if (var6 != null && !"".equals(var6) && !"".equals(com.aspose.slides.ms.System.d1.l6(var6))) {
               var7 = n5(com.aspose.slides.ms.System.d1.n5(new String[]{var6, "\\", var4, ":", var5}));
            } else {
               var7 = n5(com.aspose.slides.ms.System.d1.n5(new String[]{var4, ":", var5}));
            }

            String var8 = com.aspose.slides.ms.System.d1.n5(new String[]{"Basic ", com.aspose.slides.ms.System.z3.n5(var7)});
            return new l6(var8);
         } else {
            return null;
         }
      } else {
         return null;
      }
   }

   @Override
   public l6 l6(b5 var1, f2 var2) {
      return n5(var1, var2);
   }

   @Override
   public String n5() {
      return "Basic";
   }
}
