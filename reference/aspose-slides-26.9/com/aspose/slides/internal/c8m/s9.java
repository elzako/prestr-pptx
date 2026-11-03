package com.aspose.slides.internal.c8m;

import com.aspose.slides.Collections.IEnumerator;
import com.aspose.slides.Collections.Generic.IGenericEnumerator;
import com.aspose.slides.Collections.Generic.IGenericList;
import com.aspose.slides.Collections.Generic.KeyValuePair;
import com.aspose.slides.Collections.Generic.List;
import com.aspose.slides.Collections.Generic.SortedList;
import com.aspose.slides.ms.System.IDisposable;
import com.aspose.slides.ms.System.Xml.XmlDocument;

public class s9 extends s7 {
   a8 l6 = new a8();
   private String k5;
   private SortedList<String, z5> u3 = new SortedList<>(com.aspose.slides.ms.System.p6.l6());
   private z5 a6;
   private z5 u9;
   private z5 h0;
   private z5 c8;
   private z5 t2;
   private List<z5> s7 = new List<>();
   private static final com.aspose.slides.internal.v6g.u9 x8 = new com.aspose.slides.internal.v6g.u9(
      "text/xml",
      "image/png",
      "image/jpeg",
      "image/gif",
      "image/tiff",
      "image/x-emf",
      "image/x-wmf",
      "META-INF/manifest.xml",
      "meta.xml",
      "settings.xml",
      "styles.xml",
      "content.xml"
   );

   public s9() {
      this.a6();
      this.n5(false);
   }

   public s9(com.aspose.slides.internal.z0k.t4 var1, com.aspose.slides.internal.b8.s7 var2) {
      this.n5(var1, true, var2);
   }

   public final z5 c8() {
      return this.a6;
   }

   public final z5 t2() {
      return this.t2;
   }

   public final z5 s7() {
      return this.u9;
   }

   public final z5 x8() {
      return this.h0;
   }

   public final z5 n3() {
      return this.c8;
   }

   public final String y4() {
      return this.k5;
   }

   public final void l6(String var1) {
      this.k5 = var1;
   }

   @Override
   protected void u3() {
      IGenericEnumerator var1 = this.k5().iterator();

      try {
         while (var1.hasNext()) {
            com.aspose.slides.internal.e5a.y2 var2 = (com.aspose.slides.internal.e5a.y2)var1.next();
            if (!var2.n3()) {
               this.u9();
               var2.n5(com.aspose.slides.ms.System.d1.n5(var2.u3(), '\\', '/'));
               this.n5(var2);
            }
         }
      } finally {
         if (com.aspose.slides.internal.v6g.k5.n5(var1, IDisposable.class)) {
            var1.dispose();
         }
      }

      u5.n5(this.u3);
      this.n5(this.u3.getValues());
   }

   public final void n5(IGenericList<z5> var1) {
      IGenericEnumerator var2 = var1.iterator();

      try {
         while (var2.hasNext()) {
            z5 var3 = (z5)var2.next();
            this.n5(var3);
         }
      } finally {
         if (com.aspose.slides.internal.v6g.k5.n5(var2, IDisposable.class)) {
            var2.dispose();
         }
      }
   }

   public final z5[] k5(String var1) {
      List var2 = new List();
      IGenericEnumerator var3 = this.u3.iterator();

      try {
         while (var3.hasNext()) {
            KeyValuePair var4 = (KeyValuePair)var3.next();
            if (com.aspose.slides.ms.System.d1.l6((String)var4.getKey(), var1)) {
               var2.addItem(var4.getValue());
            }
         }
      } finally {
         if (com.aspose.slides.internal.v6g.k5.n5(var3, IDisposable.class)) {
            var3.dispose();
         }
      }

      return (z5[])var2.toArray(new z5[0]);
   }

   public final void n5(z5 var1) {
      switch (x8.n5(var1.y4())) {
         case 0:
            switch (x8.n5(var1.k5())) {
               case 7:
                  this.a6 = var1;
                  return;
               case 8:
                  if (com.aspose.slides.ms.System.d1.c8(com.aspose.slides.ms.System.d1.u9(var1.l6()), "object") == -1) {
                     this.u9 = var1;
                  } else {
                     int var4 = this.l6.n5(var1);
                     this.l6.n5(var4).n5 = var1;
                  }

                  return;
               case 9:
                  this.h0 = var1;
                  return;
               case 10:
                  if (com.aspose.slides.ms.System.d1.c8(com.aspose.slides.ms.System.d1.u9(var1.l6()), "object") == -1) {
                     this.c8 = var1;
                  } else {
                     int var3 = this.l6.n5(var1);
                     this.l6.n5(var3).l6 = var1;
                  }

                  return;
               case 11:
                  if (com.aspose.slides.ms.System.d1.c8(com.aspose.slides.ms.System.d1.u9(var1.l6()), "object") == -1) {
                     this.t2 = var1;
                  } else {
                     int var2 = this.l6.n5(var1);
                     this.l6.n5(var2).k5 = var1;
                  }

                  return;
               default:
                  return;
            }
         case 1:
         case 2:
         case 3:
         case 4:
         case 5:
         case 6:
            this.s7.addItem(var1);
            break;
         default:
            if ("mimetype".equals(var1.k5())) {
               this.l6(com.aspose.slides.internal.l7h.j5.e2().l6(var1.a6()));
            }
      }
   }

   final void n5(com.aspose.slides.internal.e5a.y2 var1) {
      z5 var2 = new z5(this, var1);
      this.u3.addItem(var2.l6(), var2);
   }

   public final z5 n5(String var1, String var2) {
      return this.n5(var1, var2, null);
   }

   public final z5 n5(String var1, String var2, byte[] var3) {
      z5 var4 = new z5(this, var1, var2, var3);
      this.u3.addItem(var4.l6(), var4);
      this.n5(var4);
      return var4;
   }

   public final void n5(com.aspose.slides.internal.e5a.d2 var1) {
      var1.n5(false);
      IGenericEnumerator var2 = this.u3.getValues().iterator();

      try {
         while (var2.hasNext()) {
            z5 var3 = (z5)var2.next();
            String var4 = com.aspose.slides.ms.System.d1.u3(var3.l6(),new char[]{ '/'});
            com.aspose.slides.internal.e5a.y2 var5 = var1.n5(var4, null, var3.a6());
            if (var3.e2()) {
               var5.n5((short)0);
            }
         }
      } finally {
         if (com.aspose.slides.internal.v6g.k5.n5(var2, IDisposable.class)) {
            var2.dispose();
         }
      }
   }

   public final void n5(com.aspose.slides.internal.z0k.t4 var1) {
      String var2 = "urn:oasis:names:tc:opendocument:xmlns:office:1.0";
      XmlDocument var3 = new XmlDocument();
      var3.setXmlResolver(null);
      var3.appendChild(var3.createXmlDeclaration("1.0", "utf-8", null));
      com.aspose.slides.ms.System.Xml.m8 var4 = var3.createElement("office:document", var2);
      var4.n5("mimetype", var2, "application/vnd.oasis.opendocument.presentation");
      var3.appendChild(var4);
      XmlDocument var5 = new XmlDocument();
      var5.setXmlResolver(null);
      var5.load(this.s7().h0());
      IEnumerator var6 = var5.getDocumentElement().getChildNodes().iterator();

      try {
         while (var6.hasNext()) {
            com.aspose.slides.ms.System.Xml.l0 var7 = (com.aspose.slides.ms.System.Xml.l0)var6.next();
            var4.appendChild(var3.importNode(var7, true));
         }
      } finally {
         if (com.aspose.slides.internal.v6g.k5.n5(var6, IDisposable.class)) {
            ((IDisposable)var6).dispose();
         }
      }

      var5.load(this.x8().h0());
      IEnumerator var59 = var5.getDocumentElement().getChildNodes().iterator();

      try {
         while (var59.hasNext()) {
            com.aspose.slides.ms.System.Xml.l0 var8 = (com.aspose.slides.ms.System.Xml.l0)var59.next();
            var4.appendChild(var3.importNode(var8, true));
         }
      } finally {
         if (com.aspose.slides.internal.v6g.k5.n5(var59, IDisposable.class)) {
            ((IDisposable)var59).dispose();
         }
      }

      com.aspose.slides.ms.System.Xml.l0 var60 = null;
      var5.load(this.n3().h0());
      IEnumerator var9 = var5.getDocumentElement().getChildNodes().iterator();

      try {
         while (var9.hasNext()) {
            com.aspose.slides.ms.System.Xml.l0 var10 = (com.aspose.slides.ms.System.Xml.l0)var9.next();
            if (com.aspose.slides.ms.System.d1.a6("office:automatic-styles", var10.getName())) {
               var60 = var4.appendChild(var3.importNode(var10, true));
            } else {
               var4.appendChild(var3.importNode(var10, true));
            }
         }
      } finally {
         if (com.aspose.slides.internal.v6g.k5.n5(var9, IDisposable.class)) {
            ((IDisposable)var9).dispose();
         }
      }

      var5.load(this.t2().h0());
      IEnumerator var61 = var5.getDocumentElement().getAttributes().iterator();

      try {
         while (var61.hasNext()) {
            com.aspose.slides.ms.System.Xml.u8 var11 = (com.aspose.slides.ms.System.Xml.u8)var61.next();
            var4.k5(var11.getName(), var11.getValue());
         }
      } finally {
         if (com.aspose.slides.internal.v6g.k5.n5(var61, IDisposable.class)) {
            ((IDisposable)var61).dispose();
         }
      }

      IEnumerator var62 = var5.getDocumentElement().getChildNodes().iterator();

      try {
         while (var62.hasNext()) {
            com.aspose.slides.ms.System.Xml.l0 var12 = (com.aspose.slides.ms.System.Xml.l0)var62.next();
            if (var60 != null && com.aspose.slides.ms.System.d1.a6("office:automatic-styles", var12.getName())) {
               IEnumerator var13 = var12.getChildNodes().iterator();

               try {
                  while (var13.hasNext()) {
                     com.aspose.slides.ms.System.Xml.l0 var14 = (com.aspose.slides.ms.System.Xml.l0)var13.next();
                     var60.appendChild(var3.importNode(var14, true));
                  }
               } finally {
                  if (com.aspose.slides.internal.v6g.k5.n5(var13, IDisposable.class)) {
                     ((IDisposable)var13).dispose();
                  }
               }
            } else {
               var4.appendChild(var3.importNode(var12, true));
            }
         }
      } finally {
         if (com.aspose.slides.internal.v6g.k5.n5(var62, IDisposable.class)) {
            ((IDisposable)var62).dispose();
         }
      }

      var3.save(var1);
   }
}
