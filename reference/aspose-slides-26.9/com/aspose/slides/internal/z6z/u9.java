package com.aspose.slides.internal.z6z;

import com.aspose.slides.Collections.Generic.Dictionary;
import com.aspose.slides.Collections.Generic.IGenericList;
import com.aspose.slides.Collections.Generic.KeyValuePair;
import com.aspose.slides.Collections.Generic.List;
import com.aspose.slides.Collections.Generic.List$Enumerator;
import com.aspose.slides.internal.e1.j5;
import com.aspose.slides.internal.g7.h3r;
import com.aspose.slides.internal.g7.u0a;
import com.aspose.slides.internal.g7.y5s;
import com.aspose.slides.internal.o9b.f2;
import com.aspose.slides.internal.o9b.w1;
import com.aspose.slides.ms.System.IDisposable;
import com.aspose.slides.ms.System.d1;
import com.aspose.slides.ms.System.Xml.f4;

public class u9 {
   private int n5 = 1;
   private final com.aspose.slides.internal.l2.u3 l6;
   private com.aspose.slides.internal.b8.n5 k5;
   private c8 u3;
   private k5 a6;
   private final List<String> u9 = new List<>();
   private final List<String> h0 = new List<>();
   private final Dictionary<String, String> c8 = new Dictionary<>();
   private f2 t2 = f2.n5.a6();
   private int s7 = 0;
   private List<y4> x8 = new List<>();
   private int n3;

   public u9(com.aspose.slides.internal.l2.u3 var1) {
      this.l6 = var1;
      this.u9();
   }

   public final void n5() {
      com.aspose.slides.internal.l2.u9 var1 = this.l6.l6().n5("/Documents/1/FixedDocument.fdoc");

      for (KeyValuePair var3 : this.a6.a6()) {
         boolean var4 = true;
         if (com.aspose.slides.internal.v6g.k5.l6(var3.getValue(), h3r.class)) {
            y5s var5 = ((u0a)var3.getValue()).l6().t4();
            byte var6 = 4;
            byte var7 = 8;
            var4 = (var5.u3() & 65535 & 4) != 0 && (var5.u3() & 65535 & 8) == 0;
         }

         if (var4) {
            var1.u9().n5("http://schemas.microsoft.com/xps/2005/06/restricted-font", (String)var3.getKey(), false);
         }
      }

      this.k5.l6();
      this.h0();
      this.c8();
      this.t2();
      this.a6.n5();
      com.aspose.slides.internal.l2.s7.n5(this.l6, false);
      com.aspose.slides.internal.l2.n5.n5(this.l6, false);
   }

   public final void n5(float var1, float var2) {
      this.k5.l6("PageContent");
      this.k5.k5("Source", d1.n5("Pages/{0}.fpage", new Object[]{this.n5}));
      this.a6.n5(this.n5);
      this.u3 = new c8(this.a6, new z3(this.a6.l6().u3(), true), true);
      this.u3.n5(this.n5, var1, var2);
   }

   public final void l6() {
      if (this.u9 != null && this.u9.size() > 0) {
         this.k5.l6("PageContent.LinkTargets");
         List$Enumerator var1 = this.u9.iterator();

         try {
            while (var1.hasNext()) {
               String var2 = (String)var1.next();
               this.k5.l6("LinkTarget");
               this.k5.k5("Name", var2);
               this.k5.k5();
            }
         } finally {
            if (com.aspose.slides.internal.v6g.k5.n5(var1, IDisposable.class)) {
               var1.dispose();
            }
         }

         this.u9.clear();
         this.k5.k5();
      }

      this.k5.k5();
      this.u3.n5();
      this.n5++;
   }

   public final void n5(com.aspose.slides.internal.e1.u9 var1) {
      String var2 = this.n5(var1.l6(), var1.n5().u3());
      if (this.u3().l6() > 0 && !var1.k5()) {
         this.n5(this.u3().l6(), var1.l6(), var2);
      }
   }

   public final void n5(j5 var1) {
      if (var1.l6() < this.u3().n5()) {
         String var2 = d1.n5("outline_{0}", new Object[]{this.s7++});
         String var3 = this.n5(var2, var1.n5().u3());
         this.n5(var1.l6() + 1, var1.k5(), var3);
      }
   }

   public final void n5(int var1, String var2, String var3) {
      if (var1 > this.n3) {
         var1 = this.n3 + 1;
      }

      y4 var4 = new y4(var1, var2, var3);
      this.x8.addItem(var4);
      this.n3 = var1;
   }

   private String n5(String var1, w1 var2) {
      if (!this.h0.containsItem(var1)) {
         String var3 = this.a6.n5(var1);
         this.u3.n5(var3, var2.u3());
         this.u9.addItem(var3);
         this.h0.addItem(var1);
         return var3;
      } else {
         return d1.n5;
      }
   }

   public final void n5(f2 var1) {
      if (this.n5 == 1) {
         var1.l6(this.t2);
      }

      String var2 = d1.n5("{0}{1}", var1.l6(), var1.k5());
      String var3 = null;
      String[] var4 = new String[]{var3};
      boolean var5 = !this.c8.tryGetValue(var2, var4);
      var3 = var4[0];
      if (var5) {
         var3 = d1.n5("/Documents/1/Metadata/Page{0}_PT.xml", new Object[]{this.n5});
         this.c8.set_Item(var2, var3);
         com.aspose.slides.internal.l2.u9 var6 = new com.aspose.slides.internal.l2.u9(var3, "application/vnd.ms-printing.printticket+xml");
         this.l6.l6().n5(var6);
         t4.n5(new com.aspose.slides.internal.b8.n5(var6.u3(), true), var1.a6(), true);
      }

      this.a6.l6().u9().n5("http://schemas.microsoft.com/xps/2005/06/printticket", var3, false);
   }

   private void n5(com.aspose.slides.internal.l2.u9 var1) {
      com.aspose.slides.internal.l2.u9 var2 = new com.aspose.slides.internal.l2.u9("/Metadata/MXDC_Empty_PT.xml", "application/vnd.ms-printing.printticket+xml");
      this.l6.l6().n5(var2);
      t4.n5(new com.aspose.slides.internal.b8.n5(var2.u3(), true));
      var1.u9().n5("http://schemas.microsoft.com/xps/2005/06/printticket", var2.n5(), false);
   }

   private void l6(com.aspose.slides.internal.l2.u9 var1) {
      com.aspose.slides.internal.l2.u9 var2 = new com.aspose.slides.internal.l2.u9("/Metadata/Job_PT.xml", "application/vnd.ms-printing.printticket+xml");
      this.l6.l6().n5(var2);
      t4.n5(new com.aspose.slides.internal.b8.n5(var2.u3(), true), this.t2.a6(), false);
      var1.u9().n5("http://schemas.microsoft.com/xps/2005/06/printticket", var2.n5(), false);
   }

   private void u9() {
      this.a6 = new k5(this.l6);
      com.aspose.slides.internal.l2.u9 var1 = new com.aspose.slides.internal.l2.u9(
         "/Documents/1/FixedDocument.fdoc", "application/vnd.ms-package.xps-fixeddocument+xml"
      );
      this.l6.l6().n5(var1);
      this.k5 = new com.aspose.slides.internal.b8.n5(var1.u3(), false);
      this.k5.n5("FixedDocument");
      this.k5.k5("xmlns", "http://schemas.microsoft.com/xps/2005/06");
      this.n5(var1);
   }

   private void h0() {
      com.aspose.slides.internal.l2.u9 var1 = new com.aspose.slides.internal.l2.u9(
         "/FixedDocumentSequence.fdseq", "application/vnd.ms-package.xps-fixeddocumentsequence+xml"
      );
      this.l6.l6().n5(var1);
      com.aspose.slides.internal.b8.n5 var2 = new com.aspose.slides.internal.b8.n5(var1.u3(), false);
      var2.n5("FixedDocumentSequence");
      var2.k5("xmlns", "http://schemas.microsoft.com/xps/2005/06");
      var2.l6("DocumentReference");
      var2.k5("Source", "Documents/1/FixedDocument.fdoc");
      var2.k5();
      var2.l6();
      this.l6.k5().n5("http://schemas.microsoft.com/xps/2005/06/fixedrepresentation", "/FixedDocumentSequence.fdseq", false);
      this.l6(var1);
   }

   private void c8() {
      this.a6.n5(1, "Only built-in document properties will be output to XPS. All custom document properties will be lost");
      com.aspose.slides.internal.l2.u9 var1 = new com.aspose.slides.internal.l2.u9(
         "/docProps/core.xml", "application/vnd.openxmlformats-package.core-properties+xml"
      );
      this.l6.l6().n5(var1);
      com.aspose.slides.internal.b8.n5 var2 = new com.aspose.slides.internal.b8.n5(var1.u3(), false);
      com.aspose.slides.internal.l2.l6.n5(
         var2,
         this.a6.u3().l6(),
         this.a6.u3().u3(),
         this.a6.u3().a6(),
         this.a6.u3().u9(),
         this.a6.u3().h0(),
         this.a6.u3().c8(),
         this.a6.u3().t2(),
         this.a6.u3().x8().m3(),
         this.a6.u3().n3().m3(),
         this.a6.u3().y4().m3(),
         this.a6.u3().s7()
      );
      this.l6.k5().n5("http://schemas.openxmlformats.org/package/2006/relationships/metadata/core-properties", "/docProps/core.xml", false);
   }

   private void t2() {
      if (this.x8.size() > 0) {
         com.aspose.slides.internal.l2.u9 var1 = new com.aspose.slides.internal.l2.u9(
            "/Documents/1/Structure/DocStructure.struct", "application/vnd.ms-package.xps-documentstructure+xml"
         );
         this.l6.l6().n5(var1);
         com.aspose.slides.internal.b8.n5 var2 = new com.aspose.slides.internal.b8.n5(var1.u3(), false);
         var2.n5("DocumentStructure");
         var2.k5("xmlns", "http://schemas.microsoft.com/xps/2005/06/documentstructure");
         var2.l6("DocumentStructure.Outline");
         var2.l6("DocumentOutline");
         var2.k5("xml:lang", "en-US");
         List$Enumerator var3 = this.x8.iterator();

         try {
            while (var3.hasNext()) {
               y4 var4 = (y4)var3.next();
               var2.l6("OutlineEntry");
               var2.k5("OutlineLevel", f4.n5(var4.n5()));
               var2.k5("Description", var4.l6());
               var2.k5("OutlineTarget", d1.n5("../../../FixedDocumentSequence.fdseq#{0}", new Object[]{var4.k5()}));
               var2.k5();
            }
         } finally {
            if (com.aspose.slides.internal.v6g.k5.n5(var3, IDisposable.class)) {
               var3.dispose();
            }
         }

         var2.k5();
         var2.k5();
         var2.l6();
         com.aspose.slides.internal.l2.u9 var8 = this.l6.l6().n5("/Documents/1/FixedDocument.fdoc");
         var8.u9().n5("http://schemas.microsoft.com/xps/2005/06/documentstructure", "/Documents/1/Structure/DocStructure.struct", false);
      }
   }

   public final c8 k5() {
      return this.u3;
   }

   public final void n5(com.aspose.slides.internal.b8.u9 var1) {
      this.a6.n5(var1);
   }

   public final n3 u3() {
      return this.a6.k5();
   }

   public final void n5(n3 var1) {
      this.a6.n5(var1);
   }

   public final IGenericList<com.aspose.slides.internal.b8.n3> a6() {
      return this.a6.u9();
   }
}
