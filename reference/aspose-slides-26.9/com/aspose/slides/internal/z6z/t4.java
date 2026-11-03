package com.aspose.slides.internal.z6z;

import com.aspose.slides.internal.o9b.f2;
import com.aspose.slides.ms.System.Xml.f4;

public class t4 {
   public static void n5(com.aspose.slides.internal.b8.n5 var0, f2 var1, boolean var2) {
      l6(var0);
      n5(var0, var1.a6());
      n5(var0, var2);
      var0.l6();
   }

   public static void n5(com.aspose.slides.internal.b8.n5 var0) {
      l6(var0);
      var0.l6();
   }

   private static void l6(com.aspose.slides.internal.b8.n5 var0) {
      var0.n5("psf:PrintTicket");
      var0.k5("version", "1");
      var0.k5("xmlns:psf", "http://schemas.microsoft.com/windows/2003/08/printing/printschemaframework");
      var0.k5("xmlns:xsi", "http://www.w3.org/2001/XMLSchema-instance");
      var0.k5("xmlns:xsd", "http://www.w3.org/2001/XMLSchema");
      var0.k5("xmlns:ns0000", "http://schemas.microsoft.com/windows/2006/06/printing/printschemakeywords/microsoftxpsdocumentwriter");
      var0.k5("xmlns:psk", "http://schemas.microsoft.com/windows/2003/08/printing/printschemakeywords");
   }

   private static void n5(com.aspose.slides.internal.b8.n5 var0, f2 var1) {
      boolean var2 = var1.l6() > var1.k5();
      int var3 = var2 ? com.aspose.slides.internal.n2d.t2.u3(var1.k5()) : com.aspose.slides.internal.n2d.t2.u3(var1.l6());
      int var4 = var2 ? com.aspose.slides.internal.n2d.t2.u3(var1.l6()) : com.aspose.slides.internal.n2d.t2.u3(var1.k5());
      n5(var0, "psk:PageMediaSize");
      l6(var0, z1.n5(var1.a6()));
      k5(var0, "psk:MediaSizeWidth");
      n5(var0, "xsd:integer", f4.n5(var3));
      var0.k5();
      k5(var0, "psk:MediaSizeHeight");
      n5(var0, "xsd:integer", f4.n5(var4));
      var0.k5();
      var0.k5();
      var0.k5();
      n5(var0, "psk:PageOrientation");
      l6(var0, var2 ? "psk:Landscape" : "psk:Portrait");
      var0.k5();
      var0.k5();
   }

   private static void n5(com.aspose.slides.internal.b8.n5 var0, boolean var1) {
      n5(var0, var1 ? "psk:PageInputBin" : "psk:JobInputBin");
      l6(var0, "psk:AutoSelect");
      var0.k5();
      var0.k5();
   }

   private static void n5(com.aspose.slides.internal.b8.n5 var0, String var1) {
      var0.l6("psf:Feature");
      var0.k5("name", var1);
   }

   private static void l6(com.aspose.slides.internal.b8.n5 var0, String var1) {
      var0.l6("psf:Option");
      var0.k5("name", var1);
   }

   private static void k5(com.aspose.slides.internal.b8.n5 var0, String var1) {
      var0.l6("psf:ScoredProperty");
      var0.k5("name", var1);
   }

   private static void n5(com.aspose.slides.internal.b8.n5 var0, String var1, String var2) {
      var0.l6("psf:Value");
      var0.k5("xsi:type", var1);
      var0.u3(var2);
      var0.k5();
   }
}
