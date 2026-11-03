package com.aspose.slides.internal.k4y;

import com.aspose.slides.exceptions.Exception;

public class k7v extends b3 {
   private g7 n5;
   private static final com.aspose.slides.internal.v6g.u9 l6 = new com.aspose.slides.internal.v6g.u9("boolVal", "intVal", "fltVal", "strVal", "clrVal");

   public k7v(com.aspose.slides.ms.System.Xml.c7 var1) {
      n5(var1, new k7v$1(this, var1));
   }

   public k7v() {
   }

   @Override
   public void n5(String var1, com.aspose.slides.internal.n8e.u4 var2, String var3) {
      var2.n5(var1, var3, null);
      if (this.n5 != null) {
         switch (l6.n5(this.n5.n5())) {
            case 0:
               ((w5w)this.n5.k5()).n5("p", var2, this.n5.n5());
               break;
            case 1:
               ((f1f)this.n5.k5()).n5("p", var2, this.n5.n5());
               break;
            case 2:
               ((k1k)this.n5.k5()).n5("p", var2, this.n5.n5());
               break;
            case 3:
               ((w8j)this.n5.k5()).n5("p", var2, this.n5.n5());
               break;
            case 4:
               ((z4)this.n5.k5()).n5("p", var2, this.n5.n5());
         }
      }

      var2.s7();
   }

   public final g7 n5(String var1) {
      if (this.n5 != null) {
         throw new Exception("Value already is initialized.");
      }

      switch (l6.n5(var1)) {
         case 0:
            this.n5 = new g7("boolVal", new w5w());
            break;
         case 1:
            this.n5 = new g7("intVal", new f1f());
            break;
         case 2:
            this.n5 = new g7("fltVal", new k1k());
            break;
         case 3:
            this.n5 = new g7("strVal", new w8j());
            break;
         case 4:
            this.n5 = new g7("clrVal", new z4());
            break;
         default:
            throw new Exception(com.aspose.slides.ms.System.d1.n5(new String[]{"Wrong element: ", var1}));
      }

      return this.n5;
   }

   public final g7 n5() {
      return this.n5;
   }

   // $VF: synthetic method
   static com.aspose.slides.internal.v6g.u9 l6() {
      return l6;
   }

   // $VF: synthetic method
   static g7 n5(k7v var0, g7 var1) {
      return var0.n5 = var1;
   }
}
