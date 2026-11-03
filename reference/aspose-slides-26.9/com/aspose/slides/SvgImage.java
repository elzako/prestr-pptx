package com.aspose.slides;

import com.aspose.slides.Collections.Generic.List;
import com.aspose.slides.exceptions.ArgumentNullException;
import com.aspose.slides.ms.System.Xml.XmlDocument;
import java.io.InputStream;
import java.io.OutputStream;

public class SvgImage implements ISvgImage {
   private byte[] n5;
   private w8j l6;
   private IExternalResourceResolver k5;
   private String u3;
   private long a6;
   private PPImage u9;

   public SvgImage(byte[] data) {
      this(data, null, null);
   }

   public SvgImage(String svgContent) {
      this(svgContent, null, null);
   }

   public SvgImage(InputStream stream) {
      this(com.aspose.slides.internal.z0k.t4.fromJava(stream));
   }

   SvgImage(com.aspose.slides.internal.z0k.t4 stream) {
      this(stream, null, null);
   }

   public SvgImage(byte[] data, IExternalResourceResolver externalResResolver, String baseUri) {
      if (data == null) {
         throw new ArgumentNullException("data");
      }

      this.k5 = externalResResolver;
      this.l6 = new w8j(externalResResolver, baseUri);
      this.n5 = this.l6(com.aspose.slides.internal.l7h.j5.z3().l6(data));
      this.u3 = baseUri;
   }

   public SvgImage(String svgContent, IExternalResourceResolver externalResResolver, String baseUri) {
      if (svgContent == null) {
         throw new ArgumentNullException("svgContent");
      }

      this.k5 = externalResResolver;
      this.l6 = new w8j(externalResResolver, baseUri);
      this.n5 = this.l6(svgContent);
      this.u3 = baseUri;
   }

   public SvgImage(InputStream stream, IExternalResourceResolver externalResResolver, String baseUri) {
      this(com.aspose.slides.internal.z0k.t4.fromJava(stream), externalResResolver, baseUri);
   }

   SvgImage(com.aspose.slides.internal.z0k.t4 stream, IExternalResourceResolver externalResResolver, String baseUri) {
      if (stream == null) {
         throw new ArgumentNullException("stream");
      }

      this.k5 = externalResResolver;
      this.l6 = new w8j(externalResResolver, baseUri);
      this.n5 = this.l6(com.aspose.slides.internal.l7h.j5.z3().l6(com.aspose.slides.internal.q7.n5.n5(stream)));
      this.u3 = baseUri;
   }

   @Override
   public final byte[] getSvgData() {
      return this.n5;
   }

   @Override
   public final IExternalResourceResolver getExternalResourceResolver() {
      return this.k5;
   }

   @Override
   public final String getBaseUri() {
      return this.u3;
   }

   @Override
   public final String getSvgContent() {
      return this.k5() ? this.u9() : this.n5();
   }

   final String n5() {
      String var1 = com.aspose.slides.internal.l7h.j5.z3().l6(this.n5);
      int var2 = com.aspose.slides.ms.System.d1.u3(var1, '<');
      return com.aspose.slides.ms.System.d1.k5(var1, var2);
   }

   @Override
   public final void writeAsEmf(OutputStream stream) {
      com.aspose.slides.internal.l6o.l6.n5(new SvgImage$1(this, stream));
   }

   void n5(com.aspose.slides.internal.z0k.t4 var1) {
      e7n.n5(var1, "stream");
      com.aspose.slides.internal.w9s.k5 var2 = new com.aspose.slides.internal.w9s.k5(this.u3());
      com.aspose.slides.internal.z0k.e2 var3 = var2.n5(n5(this.getSvgContent()));

      try {
         var1.setPosition(0L);
         var3.writeTo(var1);
      } finally {
         if (var3 != null) {
            var3.dispose();
         }
      }
   }

   final long l6() {
      if ((this.a6 & 4294967295L) == 0L) {
         this.a6 = com.aspose.slides.internal.h3k.u3.n5(this.n5);
      }

      return this.a6;
   }

   final boolean k5() {
      return com.aspose.slides.ms.System.d1.t2(this.n5(), ".MsftOfcThm");
   }

   private String u9() {
      if (this.k5() && this.a6() != null && this.a6().x8() != null) {
         List var1 = SlideUtil.n5(IShape.class, this.a6().x8());
         IShape var2 = !var1.isEmpty() ? (IShape)var1.get_Item(0) : null;
         return ((SvgImage)this.n5(var2)).n5();
      } else {
         return this.n5();
      }
   }

   final ISvgImage n5(IShape var1) {
      if (this.k5() && var1 != null) {
         k7v var2 = new k7v(var1, this);
         return var2.k5();
      } else {
         return this;
      }
   }

   final w8j u3() {
      return this.l6;
   }

   static String n5(String var0) {
      XmlDocument var1 = new XmlDocument();
      var1.setXmlResolver(null);
      var1.load(new com.aspose.slides.internal.z0k.w1(var0));
      com.aspose.slides.ms.System.Xml.s2 var2 = new com.aspose.slides.ms.System.Xml.s2(var1.getNameTable());
      var2.n5("s", "http://www.w3.org/2000/svg");
      com.aspose.slides.ms.System.Xml.i0 var3 = var1.selectNodes("/s:svg/s:foreignObject", var2);
      if (var3 != null && var3.n5() >= 1) {
         for (int var4 = 0; var4 < var3.n5(); var4++) {
            if ((var3.k5(var4).getChildNodes().n5() == 1 || "body".equals(var3.k5(var4).getChildNodes().k5(0).getName()))
               && var3.k5(var4).getChildNodes().k5(0).getAttributes() != null
               && "http://www.w3.org/1999/xhtml".equals(var3.k5(var4).getChildNodes().k5(0).getAttributes().n5(0).getInnerText())) {
               String var5 = var3.k5(var4).getChildNodes().k5(0).getInnerXml();
               com.aspose.slides.internal.z5.n5 var6 = new com.aspose.slides.internal.z5.n5(new com.aspose.slides.internal.j4.n5(), null);
               com.aspose.slides.internal.z5.l6 var7 = new com.aspose.slides.internal.z5.l6();
               if (var3.k5(var4).getAttributes() != null) {
                  int var8 = com.aspose.slides.ms.System.a3.n5(var3.k5(var4).getAttributes().n5("width").getValue());
                  int var9 = com.aspose.slides.ms.System.a3.n5(var3.k5(var4).getAttributes().n5("height").getValue());
                  var7.h0()
                     .n5(
                        new com.aspose.slides.internal.z5.u9(
                           new com.aspose.slides.internal.z5.t2(new com.aspose.slides.internal.z5.a6(var8, 0), new com.aspose.slides.internal.z5.a6(var9, 0))
                        )
                     );
               }

               com.aspose.slides.internal.z5.k5 var15 = var6.n5(var5, var7);
               com.aspose.slides.internal.e1.w1[] var16 = new com.aspose.slides.internal.e1.w1[]{var15.n5()[0]};
               var0 = com.aspose.slides.internal.b8n.u9.n5(var16, false);
               var1.getDocumentElement().removeChild(var3.k5(var4));
               XmlDocument var10 = new XmlDocument();
               var10.setXmlResolver(null);
               var10.load(new com.aspose.slides.internal.z0k.w1(var0));
               var2.n5("s", "http://www.w3.org/2000/svg");
               com.aspose.slides.ms.System.Xml.l0 var11 = var1.importNode(var10.getDocumentElement(), true);
               var1.getDocumentElement().appendChild(var11);
            }
         }

         com.aspose.slides.internal.z0k.e2 var13 = new com.aspose.slides.internal.z0k.e2();
         var1.save(var13);
         var13.setPosition(0L);
         com.aspose.slides.internal.z0k.m3 var14 = new com.aspose.slides.internal.z0k.m3(var13);
         return var14.c8();
      } else {
         return var0;
      }
   }

   private byte[] l6(String var1) {
      com.aspose.slides.internal.r7c.u3 var2 = com.aspose.slides.internal.r7c.c8.n5(var1, "<svg.+</svg>", 0);
      return var2.u3() ? com.aspose.slides.internal.l7h.j5.z3().u3(var2.k5()) : com.aspose.slides.internal.l7h.j5.z3().u3(var1);
   }

   final PPImage a6() {
      return this.u9;
   }

   final void n5(PPImage var1) {
      this.u9 = var1;
   }
}
