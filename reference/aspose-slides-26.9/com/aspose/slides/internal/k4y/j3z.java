package com.aspose.slides.internal.k4y;

import com.aspose.slides.Collections.Generic.List;
import com.aspose.slides.Collections.Generic.List$Enumerator;
import com.aspose.slides.exceptions.Exception;
import com.aspose.slides.ms.System.IDisposable;

public class j3z extends b3 {
   private f4l n5;
   private i8n l6;
   private List<r1x> k5;
   private static final com.aspose.slides.internal.v6g.u9 u3 = new com.aspose.slides.internal.v6g.u9("bodyPr", "lstStyle", "p");

   public j3z(com.aspose.slides.ms.System.Xml.c7 var1) {
      this.h0();
      n5(var1, new j3z$1(this, var1));
   }

   public j3z() {
      this.h0();
      this.n5 = new f4l();
   }

   private void h0() {
      this.k5 = new List<>();
   }

   @Override
   public void n5(String var1, com.aspose.slides.internal.n8e.u4 var2, String var3) {
      var2.n5(var1, var3, null);
      this.n5.n5("a", var2, "bodyPr");
      if (this.l6 != null) {
         this.l6.n5("a", var2, "lstStyle");
      }

      List$Enumerator var4 = this.k5.iterator();

      try {
         while (var4.hasNext()) {
            r1x var5 = (r1x)var4.next();
            var5.n5("a", var2, "p");
         }
      } finally {
         if (com.aspose.slides.internal.v6g.k5.n5(var4, IDisposable.class)) {
            var4.dispose();
         }
      }

      var2.s7();
   }

   public final i8n n5() {
      if (this.l6 != null) {
         throw new Exception("Only one <lstStyle> element can be added.");
      }

      this.l6 = new i8n();
      return this.l6;
   }

   public final r1x l6() {
      r1x var1 = new r1x();
      this.k5.addItem(var1);
      return var1;
   }

   public final f4l k5() {
      return this.n5;
   }

   public final i8n u3() {
      return this.l6;
   }

   public final r1x[] a6() {
      return this.k5.toArray(new r1x[0]);
   }

   // $VF: synthetic method
   static com.aspose.slides.internal.v6g.u9 u9() {
      return u3;
   }

   // $VF: synthetic method
   static f4l n5(j3z var0, f4l var1) {
      return var0.n5 = var1;
   }

   // $VF: synthetic method
   static i8n n5(j3z var0, i8n var1) {
      return var0.l6 = var1;
   }

   // $VF: synthetic method
   static List n5(j3z var0) {
      return var0.k5;
   }
}
