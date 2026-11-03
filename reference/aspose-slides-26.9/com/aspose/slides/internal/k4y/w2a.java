package com.aspose.slides.internal.k4y;

import com.aspose.slides.exceptions.Exception;

public class w2a extends b3 {
   private long n5;
   private g7 l6;
   private r6o k5;
   private long u3;
   private l8r a6;
   private static final com.aspose.slides.internal.v6g.u9 u9 = new com.aspose.slides.internal.v6g.u9("sd", "custGeom", "prstGeom", "type", "seed", "extLst");

   public w2a(com.aspose.slides.ms.System.Xml.c7 var1) {
      this.u9();
      w2a$1 var2 = new w2a$1(this);
      n5(var1, var2);
      n5(var1, new w2a$2(this, var1));
   }

   public w2a() {
      this.u9();
   }

   private void u9() {
      this.n5 = 4294967295L;
      this.u3 = 4294967295L;
   }

   @Override
   public void n5(String var1, com.aspose.slides.internal.n8e.u4 var2, String var3) {
      var2.n5("ask", var3, "http://schemas.microsoft.com/office/drawing/2018/sketchyshapes");
      if (var2.n5("http://schemas.openxmlformats.org/drawingml/2006/main") == null) {
         var2.u3("xmlns", "a", null, "http://schemas.openxmlformats.org/drawingml/2006/main");
      }

      if ((this.n5 & 4294967295L) != 4294967295L) {
         var2.l6("sd", com.aspose.slides.ms.System.Xml.f4.l6(this.n5));
      }

      if (this.l6 != null) {
         switch (u9.n5(this.l6.n5())) {
            case 1:
               ((u1s)this.l6.k5()).n5("a", var2, this.l6.n5());
               break;
            case 2:
               ((r7n)this.l6.k5()).n5("a", var2, this.l6.n5());
         }
      }

      if (this.k5 != null) {
         this.k5.n5("ask", var2, "type");
      }

      if ((this.u3 & 4294967295L) != 4294967295L) {
         this.n5("ask", var2, "seed", com.aspose.slides.ms.System.Xml.f4.l6(this.u3), false);
      }

      if (this.a6 != null) {
         this.a6.n5("ask", var2, "extLst");
      }

      var2.s7();
   }

   public final r6o n5() {
      if (this.k5 != null) {
         throw new Exception("Only one <type> element can be added.");
      }

      this.k5 = new r6o();
      return this.k5;
   }

   public final g7 n5(String var1) {
      if (this.l6 != null) {
         throw new Exception("Geometry already is initialized.");
      }

      switch (u9.n5(var1)) {
         case 1:
            this.l6 = new g7("custGeom", new u1s());
            break;
         case 2:
            this.l6 = new g7("prstGeom", new r7n());
            break;
         default:
            throw new Exception(com.aspose.slides.ms.System.d1.n5(new String[]{"Wrong element: ", var1}));
      }

      return this.l6;
   }

   public final long l6() {
      return this.n5;
   }

   public final void n5(long var1) {
      this.n5 = var1;
   }

   public final g7 k5() {
      return this.l6;
   }

   public final r6o u3() {
      return this.k5;
   }

   // $VF: synthetic method
   static com.aspose.slides.internal.v6g.u9 a6() {
      return u9;
   }

   // $VF: synthetic method
   static long n5(w2a var0, long var1) {
      return var0.n5 = var1;
   }

   // $VF: synthetic method
   static g7 n5(w2a var0, g7 var1) {
      return var0.l6 = var1;
   }

   // $VF: synthetic method
   static r6o n5(w2a var0, r6o var1) {
      return var0.k5 = var1;
   }

   // $VF: synthetic method
   static long l6(w2a var0, long var1) {
      return var0.u3 = var1;
   }

   // $VF: synthetic method
   static l8r n5(w2a var0, l8r var1) {
      return var0.a6 = var1;
   }
}
