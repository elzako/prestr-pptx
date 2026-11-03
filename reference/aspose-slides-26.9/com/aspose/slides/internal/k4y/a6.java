package com.aspose.slides.internal.k4y;

import com.aspose.slides.exceptions.Exception;

public final class a6 extends b3 {
   private n7n n5;
   private s1k l6;
   private s1k k5;
   private s1k u3;
   private x1s a6;

   a6(com.aspose.slides.ms.System.Xml.c7 var1) {
      if (com.aspose.slides.internal.n8e.f0.n5.n5("http://schemas.microsoft.com/office/drawing/2015/9/8/chartex") && "cx1".equals(var1.e2())) {
         this.l6 = new s1k(var1);
      } else if (com.aspose.slides.internal.n8e.f0.n5.n5("http://schemas.microsoft.com/office/drawing/2015/10/21/chartex") && "cx2".equals(var1.e2())) {
         this.k5 = new s1k(var1);
      } else if (com.aspose.slides.internal.n8e.f0.n5.n5("http://schemas.microsoft.com/office/drawing/2016/5/10/chartex") && "cx4".equals(var1.e2())) {
         this.u3 = new s1k(var1);
      } else if (com.aspose.slides.internal.n8e.f0.n5.n5("http://schemas.microsoft.com/office/powerpoint/2010/main") && "p14".equals(var1.e2())) {
         this.a6 = new x1s(var1);
      } else {
         this.n5 = new n7n(var1);
      }
   }

   a6() {
   }

   @Override
   public void n5(String var1, com.aspose.slides.internal.n8e.u4 var2, String var3) {
      if (this.l6 != null || this.k5 != null || this.u3 != null || this.a6 != null) {
         var2.n5("mc", "AlternateContent", "http://schemas.openxmlformats.org/markup-compatibility/2006");
         if (this.l6 != null) {
            var2.n5("mc", "Choice", null);
            var2.u3("xmlns", "cx1", null, "http://schemas.microsoft.com/office/drawing/2015/9/8/chartex");
            var2.l6("Requires", "cx1");
            this.l6.n5("p", var2, "graphicFrame");
            var2.s7();
         }

         if (this.k5 != null) {
            var2.n5("mc", "Choice", null);
            var2.u3("xmlns", "cx2", null, "http://schemas.microsoft.com/office/drawing/2015/10/21/chartex");
            var2.l6("Requires", "cx2");
            this.k5.n5("p", var2, "graphicFrame");
            var2.s7();
         }

         if (this.u3 != null) {
            var2.n5("mc", "Choice", null);
            var2.u3("xmlns", "cx4", null, "http://schemas.microsoft.com/office/drawing/2016/5/10/chartex");
            var2.l6("Requires", "cx4");
            this.u3.n5("p", var2, "graphicFrame");
            var2.s7();
         }

         if (this.a6 != null) {
            var2.n5("mc", "Choice", null);
            var2.u3("xmlns", "p14", null, "http://schemas.microsoft.com/office/powerpoint/2010/main");
            var2.l6("Requires", "p14");
            this.a6.n5("p", var2, "contentPart");
            var2.s7();
         }

         if (this.n5 != null) {
            var2.n5("mc", "Fallback", null);
            this.n5.n5(var1, var2, "pic");
            var2.s7();
         }

         var2.s7();
      } else if (this.n5 != null) {
         this.n5.n5(var1, var2, "pic");
      }
   }

   public final n7n n5() {
      if (this.n5 != null) {
         throw new Exception("Only one <pic> element can be added.");
      }

      this.n5 = new n7n();
      return this.n5;
   }

   public final n7n l6() {
      return this.n5;
   }
}
