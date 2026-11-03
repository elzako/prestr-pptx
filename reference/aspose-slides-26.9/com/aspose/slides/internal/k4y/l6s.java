package com.aspose.slides.internal.k4y;

import com.aspose.slides.exceptions.Exception;

public final class l6s extends z8 {
   private g7 n5;
   private static final com.aspose.slides.internal.v6g.u9 l6 = new com.aspose.slides.internal.v6g.u9("numRef", "numLit");

   @Override
   public int n5() {
      switch (l6.n5(this.a6().n5())) {
         case 0:
            return 0;
         case 1:
            return 2;
         default:
            throw new Exception(com.aspose.slides.ms.System.d1.n5(new String[]{"Unknown element \"", this.a6().n5(), "\""}));
      }
   }

   @Override
   public String l6() {
      String var1 = "";
      if (this.a6() == null) {
         return var1;
      }

      switch (l6.n5(this.a6().n5())) {
         case 0:
            z3o var2 = (z3o)this.a6().k5();
            return var2.l6();
         case 1:
            throw new Exception();
         default:
            throw new Exception(com.aspose.slides.ms.System.d1.n5(new String[]{"Unknown element \"", this.a6().n5(), "\""}));
      }
   }

   public String u3() {
      switch (l6.n5(this.a6().n5())) {
         case 0:
            z3o var1 = (z3o)this.a6().k5();
            return var1.k5() != null ? var1.k5().k5() : "";
         case 1:
            a8e var2 = (a8e)this.a6().k5();
            return var2.k5();
         default:
            throw new Exception(com.aspose.slides.ms.System.d1.n5(new String[]{"Unknown element \"", this.a6().n5(), "\""}));
      }
   }

   @Override
   public x8 k5() {
      switch (l6.n5(this.a6().n5())) {
         case 0:
            z3o var1 = (z3o)this.a6().k5();
            return var1.u3();
         case 1:
            a8e var2 = (a8e)this.a6().k5();
            return var2.u9();
         default:
            throw new Exception(com.aspose.slides.ms.System.d1.n5(new String[]{"Unknown element \"", this.a6().n5(), "\""}));
      }
   }

   l6s(com.aspose.slides.ms.System.Xml.c7 var1) {
      n5(var1, new l6s$1(this, var1));
   }

   l6s() {
   }

   @Override
   public void n5(String var1, com.aspose.slides.internal.n8e.u4 var2, String var3) {
      var2.n5(var1, var3, null);
      if (this.n5 != null) {
         switch (l6.n5(this.n5.n5())) {
            case 0:
               ((z3o)this.n5.k5()).n5("c", var2, this.n5.n5());
               break;
            case 1:
               ((a8e)this.n5.k5()).n5("c", var2, this.n5.n5());
         }
      }

      var2.s7();
   }

   public final g7 n5(String var1) {
      if (this.n5 != null) {
         throw new Exception("DataSource already is initialized.");
      }

      switch (l6.n5(var1)) {
         case 0:
            this.n5 = new g7("numRef", new z3o());
            break;
         case 1:
            this.n5 = new g7("numLit", new a8e());
            break;
         default:
            throw new Exception(com.aspose.slides.ms.System.d1.n5(new String[]{"Wrong element: ", var1}));
      }

      return this.n5;
   }

   public final g7 a6() {
      return this.n5;
   }

   // $VF: synthetic method
   static com.aspose.slides.internal.v6g.u9 u9() {
      return l6;
   }

   // $VF: synthetic method
   static g7 n5(l6s var0, g7 var1) {
      return var0.n5 = var1;
   }
}
