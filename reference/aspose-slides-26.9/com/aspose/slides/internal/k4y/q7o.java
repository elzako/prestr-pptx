package com.aspose.slides.internal.k4y;

import com.aspose.slides.Collections.Generic.List;
import com.aspose.slides.Collections.Generic.List$Enumerator;
import com.aspose.slides.exceptions.Exception;
import com.aspose.slides.ms.System.IDisposable;

public class q7o extends b3 {
   private List<k8w> n5;
   private g7 l6;
   private y1g k5;
   private static final com.aspose.slides.internal.v6g.u9 u3 = new com.aspose.slides.internal.v6g.u9("summaryZmObj", "gridLayout", "fixedLayout", "extLst");

   public q7o(com.aspose.slides.ms.System.Xml.c7 var1) {
      this.a6();
      n5(var1, new q7o$1(this, var1));
   }

   public q7o() {
      this.a6();
   }

   private void a6() {
      this.n5 = new List<>();
   }

   @Override
   public void n5(String var1, com.aspose.slides.internal.n8e.u4 var2, String var3) {
      var2.n5("psuz", var3, "http://schemas.microsoft.com/office/powerpoint/2016/summaryzoom");
      if (var2.n5("http://schemas.microsoft.com/office/powerpoint/2016/6/main") == null) {
         var2.u3("xmlns", "p166", null, "http://schemas.microsoft.com/office/powerpoint/2016/6/main");
      }

      if (var2.n5("http://schemas.openxmlformats.org/drawingml/2006/main") == null) {
         var2.u3("xmlns", "a", null, "http://schemas.openxmlformats.org/drawingml/2006/main");
      }

      if (var2.n5("http://schemas.openxmlformats.org/officeDocument/2006/relationships") == null) {
         var2.u3("xmlns", "r", null, "http://schemas.openxmlformats.org/officeDocument/2006/relationships");
      }

      if (var2.n5("http://schemas.openxmlformats.org/presentationml/2006/main") == null) {
         var2.u3("xmlns", "p", null, "http://schemas.openxmlformats.org/presentationml/2006/main");
      }

      List$Enumerator var4 = this.n5.iterator();

      try {
         while (var4.hasNext()) {
            k8w var5 = (k8w)var4.next();
            var5.n5("psuz", var2, "summaryZmObj");
         }
      } finally {
         if (com.aspose.slides.internal.v6g.k5.n5(var4, IDisposable.class)) {
            var4.dispose();
         }
      }

      if (this.l6 != null) {
         switch (u3.n5(this.l6.n5())) {
            case 1:
               ((b3u)this.l6.k5()).n5("psuz", var2, this.l6.n5());
               break;
            case 2:
               ((w9z)this.l6.k5()).n5("psuz", var2, this.l6.n5());
         }
      }

      if (this.k5 != null) {
         this.k5.n5("psuz", var2, "extLst");
      }

      var2.s7();
   }

   public final k8w n5() {
      k8w var1 = new k8w();
      this.n5.addItem(var1);
      return var1;
   }

   public final g7 n5(String var1) {
      if (this.l6 != null) {
         throw new Exception("SummaryZoom already is initialized.");
      }

      switch (u3.n5(var1)) {
         case 1:
            this.l6 = new g7("gridLayout", new b3u());
            break;
         case 2:
            this.l6 = new g7("fixedLayout", new w9z());
            break;
         default:
            throw new Exception(com.aspose.slides.ms.System.d1.n5(new String[]{"Wrong element: ", var1}));
      }

      return this.l6;
   }

   public final k8w[] l6() {
      return this.n5.toArray(new k8w[0]);
   }

   public final g7 k5() {
      return this.l6;
   }

   // $VF: synthetic method
   static com.aspose.slides.internal.v6g.u9 u3() {
      return u3;
   }

   // $VF: synthetic method
   static List n5(q7o var0) {
      return var0.n5;
   }

   // $VF: synthetic method
   static g7 n5(q7o var0, g7 var1) {
      return var0.l6 = var1;
   }

   // $VF: synthetic method
   static y1g n5(q7o var0, y1g var1) {
      return var0.k5 = var1;
   }
}
