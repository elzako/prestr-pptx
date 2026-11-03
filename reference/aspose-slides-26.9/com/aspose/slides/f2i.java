package com.aspose.slides;

class f2i {
   public static e4j n5(y9i var0, y9i var1, String var2) {
      com.aspose.slides.internal.r7c.u3 var3 = new com.aspose.slides.internal.r7c.c8("(&?)\"(.*)\"(&?)").l6(var2);
      String var4 = var3.a6().n5(2).k5();
      if (!"&".equals(var3.a6().n5(1).k5()) && var0 != null && !com.aspose.slides.internal.v6g.k5.l6(var0, q1y.class)) {
         throw new CellInvalidFormulaException("Wrong concatenate formula usage. Left argument exist, but no '&' after it.");
      }

      if (!"&".equals(var3.a6().n5(3).k5()) && var1 != null && !com.aspose.slides.internal.v6g.k5.l6(var1, q1y.class)) {
         throw new CellInvalidFormulaException("Wrong concatenate formula usage. Right argument exist, but no '&' before it.");
      }

      if (!"&".equals(var3.a6().n5(1).k5()) && !"&".equals(var3.a6().n5(3).k5())
         || var1 != null && !com.aspose.slides.internal.v6g.k5.l6(var1, q1y.class)
         || var0 != null && !com.aspose.slides.internal.v6g.k5.l6(var0, q1y.class)) {
         if (!"&".equals(var3.a6().n5(1).k5()) && !"&".equals(var3.a6().n5(3).k5())) {
            throw new CellInvalidFormulaException("Wrong concatenate formula usage. No '&' symbols.");
         } else {
            return new e4j(var0, var1, var4);
         }
      } else {
         throw new CellInvalidFormulaException("Wrong concatenate formula usage. No arguments.");
      }
   }
}
