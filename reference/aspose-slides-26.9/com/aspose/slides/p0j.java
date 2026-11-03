package com.aspose.slides;

import com.aspose.slides.exceptions.ArgumentNullException;

class p0j {
   public static void n5(OleObjectFrame var0, com.aspose.slides.internal.k4y.b4f var1, OdpSerializationContext var2) {
      if (var0 == null) {
         throw new ArgumentNullException("oleFrame");
      }

      if (var1 == null) {
         throw new ArgumentNullException("frameElement");
      }

      com.aspose.slides.internal.k4y.j1a var3 = (com.aspose.slides.internal.k4y.j1a)var1.n5("object-ole").l6();
      com.aspose.slides.ms.System.o0 var4 = n5(var0.getObjectProgId()).k5();
      if (com.aspose.slides.ms.System.o0.l6(var4, com.aspose.slides.ms.System.o0.n5)) {
         var3.n5(com.aspose.slides.ms.System.d1.t2(var4.toString()));
      }

      if (var2.n3()) {
         var3.k5(com.aspose.slides.ms.System.z3.n5(var0.e2()));
         ISlidesPicture var5 = var0.getSubstitutePictureFormat().getPicture();
         if (!com.aspose.slides.ms.System.d1.n5(var5.getLinkPathLong()) && var5.getImage() == null) {
            var5.setImage(((ImageCollection)var5.getPresentation().getImages()).n5(var5.getLinkPathLong(), null));
         }

         if (var5.getImage() != null) {
            com.aspose.slides.internal.k4y.s3o var6 = (com.aspose.slides.internal.k4y.s3o)var1.n5("image").l6();
            var6.l6(com.aspose.slides.ms.System.z3.n5(var5.getImage().getBinaryData()));
         }
      } else {
         var3.n5(1);
         if (var0.u9) {
            var3.k5(1);
         }

         if (var0.isObjectLink()) {
            var3.l6(com.aspose.slides.internal.n8e.v4.n5(var0.getLinkPathLong()));
         } else {
            var3.l6(var2.n5(var0.e2()));
            var3.l6(1);
         }

         PPImage var7 = (PPImage)var0.getSubstitutePictureFormat().getPicture().getImage();
         if (var7 != null) {
            com.aspose.slides.internal.k4y.s3o var8 = (com.aspose.slides.internal.k4y.s3o)var1.n5("image").l6();
            var8.n5(var2.n5((IPPImage)var7));
            var8.l6(1);
            var8.n5(1);
         }
      }
   }

   private static com.aspose.slides.ms.System.o0 n5(String var0) {
      if (com.aspose.slides.ms.System.d1.n5(var0)) {
         return com.aspose.slides.ms.System.o0.n5;
      }

      com.aspose.slides.ms.System.o0 var1 = com.aspose.slides.ms.System.o0.n5.k5();
      if (com.aspose.slides.ms.System.d1.a6(com.aspose.slides.ms.System.d1.u9(var0), "paint.picture")) {
         var1 = new com.aspose.slides.ms.System.o0("D3E34B21-9D75-101A-8c3d-00aa001a1652");
      } else if (com.aspose.slides.ms.System.d1.a6(com.aspose.slides.ms.System.d1.u9(var0), "excel.sheet.8")) {
         var1 = new com.aspose.slides.ms.System.o0("00020820-0000-0000-C000-000000000046");
      } else if (com.aspose.slides.ms.System.d1.a6(com.aspose.slides.ms.System.d1.u9(var0), "excel.chart.8")) {
         var1 = new com.aspose.slides.ms.System.o0("00020821-0000-0000-C000-000000000046");
      } else if (com.aspose.slides.ms.System.d1.a6(com.aspose.slides.ms.System.d1.u9(var0), "excel.sheet.12")) {
         var1 = new com.aspose.slides.ms.System.o0("00020830-0000-0000-C000-000000000046");
      } else if (com.aspose.slides.ms.System.d1.a6(com.aspose.slides.ms.System.d1.u9(var0), "excel.sheetmacroenabled.12")) {
         var1 = new com.aspose.slides.ms.System.o0("00020832-0000-0000-C000-000000000046");
      } else if (com.aspose.slides.ms.System.d1.a6(com.aspose.slides.ms.System.d1.u9(var0), "excel.sheetbinarymacroenabled.12")) {
         var1 = new com.aspose.slides.ms.System.o0("00020833-0000-0000-C000-000000000046");
      } else if (com.aspose.slides.ms.System.d1.a6(com.aspose.slides.ms.System.d1.u9(var0), "word.document.8")) {
         var1 = new com.aspose.slides.ms.System.o0("00020906-0000-0000-C000-000000000046");
      } else if (com.aspose.slides.ms.System.d1.a6(com.aspose.slides.ms.System.d1.u9(var0), "word.document.12")) {
         var1 = new com.aspose.slides.ms.System.o0("F4754C9B-64F5-4B40-8AF4-679732AC0607");
      } else if (com.aspose.slides.ms.System.d1.a6(com.aspose.slides.ms.System.d1.u9(var0), "powerpoint.show.12")) {
         var1 = new com.aspose.slides.ms.System.o0("CF4F55F4-8F87-4D47-80BB-5808164BB3F8");
      } else if (com.aspose.slides.ms.System.d1.a6(com.aspose.slides.ms.System.d1.u9(var0), "powerpoint.show.8")) {
         var1 = new com.aspose.slides.ms.System.o0("64818D10-4F9B-11CF-86EA-00AA00B929E8");
      } else if (com.aspose.slides.ms.System.d1.a6(com.aspose.slides.ms.System.d1.u9(var0), "powerpoint.slide.12")) {
         var1 = new com.aspose.slides.ms.System.o0("048EB43E-2059-422F-95E0-557DA96038AF");
      } else if (com.aspose.slides.ms.System.d1.a6(com.aspose.slides.ms.System.d1.u9(var0), "word.opendocumenttext.12")) {
         var1 = new com.aspose.slides.ms.System.o0("1B261B22-AC6A-4E68-A870-AB5080E8687B");
      } else if (com.aspose.slides.ms.System.d1.a6(com.aspose.slides.ms.System.d1.u9(var0), "excel.opendocumentspreadsheet.12")) {
         var1 = new com.aspose.slides.ms.System.o0("EABCECDB-CC1C-4A6F-B4E3-7F888A5ADFC8");
      } else if (com.aspose.slides.ms.System.d1.a6(com.aspose.slides.ms.System.d1.u9(var0), "powerpoint.opendocumentpresentation.12")) {
         var1 = new com.aspose.slides.ms.System.o0("C282417B-2662-44B8-8A94-3BFF61C50900");
      } else if (com.aspose.slides.ms.System.d1.a6(com.aspose.slides.ms.System.d1.u9(var0), "msphotoed.3")) {
         var1 = new com.aspose.slides.ms.System.o0("11943940-36DE-11CF-953E-00C0A84029E9");
      }

      return var1;
   }
}
