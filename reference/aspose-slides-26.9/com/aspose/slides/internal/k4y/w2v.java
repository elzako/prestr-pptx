package com.aspose.slides.internal.k4y;

import com.aspose.slides.exceptions.Exception;

public class w2v extends b3 {
   private w2i n5;
   private w2i l6;
   private g7 k5;
   private static final com.aspose.slides.internal.v6g.u9 u3 = new com.aspose.slides.internal.v6g.u9(
      "from", "to", "sp", "grpSp", "graphicFrame", "cxnSp", "pic"
   );

   public w2v(com.aspose.slides.ms.System.Xml.c7 var1) {
      n5(var1, new w2v$1(this, var1));
   }

   public w2v() {
      this.n5 = new w2i();
      this.l6 = new w2i();
   }

   @Override
   public void n5(String var1, com.aspose.slides.internal.n8e.u4 var2, String var3) {
      var2.n5(var1, var3, null);
      this.n5.n5("cdr", var2, "from");
      this.l6.n5("cdr", var2, "to");
      if (this.k5 != null) {
         switch (u3.n5(this.k5.n5())) {
            case 2:
               ((p5w)this.k5.k5()).n5("cdr", var2, this.k5.n5());
               break;
            case 3:
               ((u7q)this.k5.k5()).n5("cdr", var2, this.k5.n5());
               break;
            case 4:
               ((g7i)this.k5.k5()).n5("cdr", var2, this.k5.n5());
               break;
            case 5:
               ((a3p)this.k5.k5()).n5("cdr", var2, this.k5.n5());
               break;
            case 6:
               ((d8y)this.k5.k5()).n5("cdr", var2, this.k5.n5());
         }
      }

      var2.s7();
   }

   public final g7 n5(String var1) {
      if (this.k5 != null) {
         throw new Exception("Shape already is initialized.");
      }

      switch (u3.n5(var1)) {
         case 2:
            this.k5 = new g7("sp", new p5w());
            break;
         case 3:
            this.k5 = new g7("grpSp", new u7q());
            break;
         case 4:
            this.k5 = new g7("graphicFrame", new g7i());
            break;
         case 5:
            this.k5 = new g7("cxnSp", new a3p());
            break;
         case 6:
            this.k5 = new g7("pic", new d8y());
            break;
         default:
            throw new Exception(com.aspose.slides.ms.System.d1.n5(new String[]{"Wrong element: ", var1}));
      }

      return this.k5;
   }

   public final w2i n5() {
      return this.n5;
   }

   public final w2i l6() {
      return this.l6;
   }

   public final g7 k5() {
      return this.k5;
   }

   // $VF: synthetic method
   static com.aspose.slides.internal.v6g.u9 u3() {
      return u3;
   }

   // $VF: synthetic method
   static w2i n5(w2v var0, w2i var1) {
      return var0.n5 = var1;
   }

   // $VF: synthetic method
   static w2i l6(w2v var0, w2i var1) {
      return var0.l6 = var1;
   }

   // $VF: synthetic method
   static g7 n5(w2v var0, g7 var1) {
      return var0.k5 = var1;
   }
}
