package com.aspose.slides.internal.s8x;

import com.aspose.slides.exceptions.Exception;
import com.aspose.slides.exceptions.InvalidOperationException;
import com.aspose.slides.internal.f8y.a6;
import com.aspose.slides.internal.l7h.a5;
import com.aspose.slides.internal.n2d.c8;
import com.aspose.slides.internal.n2d.w1;
import com.aspose.slides.internal.r5t.t2;
import com.aspose.slides.internal.z0k.u9;
import com.aspose.slides.internal.z0k.z1;
import com.aspose.slides.ms.System.a3;
import com.aspose.slides.ms.System.d1;
import com.aspose.slides.ms.System.p8;
import com.aspose.slides.ms.System.t4;

public class k5 extends l6 implements com.aspose.slides.internal.s9c.k5 {
   public static String n5 = z1.k5(z1.l6(com.aspose.slides.internal.n2d.c8.n5, d1.n5("external{0}buildtools{0}", new Object[]{z1.k5})));
   public static String l6 = z1.k5(z1.l6(n5, d1.n5("pdf-tools{0}AsposePdfValidator.exe", new Object[]{z1.k5})));
   public static String k5 = z1.k5(z1.l6(n5, d1.n5("pdf-tools{0}pdfa.exe", new Object[]{z1.k5})));
   public static String u3 = z1.k5(z1.l6(n5, d1.n5("pdf2image{0}pdf2image.exe", new Object[]{z1.k5})));
   public static String a6 = z1.k5(z1.l6(n5, d1.n5("html2image{0}html2image.exe", new Object[]{z1.k5})));
   public static String u9 = z1.k5(z1.l6(n5, d1.n5("swf2image{0}Swf2Image.exe", new Object[]{z1.k5})));
   public static String h0 = z1.k5(z1.l6(n5, d1.n5("xps2image{0}XPS2Image.exe", new Object[]{z1.k5})));
   public static String c8 = z1.k5(z1.l6(n5, d1.n5("xps-tools{0}amd64{0}isXps.exe", new Object[]{z1.k5})));
   public static String t2 = z1.k5(z1.l6(n5, d1.n5("xps-tools{0}x86{0}isXps.exe", new Object[]{z1.k5})));
   public static String s7 = z1.k5(z1.l6(n5, d1.n5("imagecomparer{0}ImageComparer.exe", new Object[]{z1.k5})));
   public static String x8 = z1.k5(z1.l6(n5, d1.n5("bff_validator{0}BFFValidator.exe", new Object[]{z1.k5})));
   public static String n3 = z1.l6(com.aspose.slides.internal.n2d.c8.n5, "testdata/iccprofile/SampleIccCmmTestRunner.exe");

   public void k5(String var1) {
      n5 = z1.k5(z1.l6(var1, d1.n5("external{0}", new Object[]{z1.k5})));
      l6 = z1.k5(z1.l6(n5, d1.n5("pdf-tools{0}AsposePdfValidator.exe", new Object[]{z1.k5})));
      k5 = z1.k5(z1.l6(n5, d1.n5("pdf-tools{0}pdfa.exe", new Object[]{z1.k5})));
      u3 = z1.k5(z1.l6(n5, d1.n5("Pdf2image{0}pdf2image.exe", new Object[]{z1.k5})));
      u9 = z1.k5(z1.l6(n5, d1.n5("swf2image{0}Swf2Image.exe", new Object[]{z1.k5})));
      h0 = z1.k5(z1.l6(n5, d1.n5("xps2image{0}XPS2Image.exe", new Object[]{z1.k5})));
      c8 = z1.k5(z1.l6(n5, d1.n5("xps-tools{0}amd64{0}isXps.exe", new Object[]{z1.k5})));
      t2 = z1.k5(z1.l6(n5, d1.n5("xps-tools{0}x86{0}isXps.exe", new Object[]{z1.k5})));
      s7 = z1.k5(z1.l6(n5, d1.n5("ImageComparer{0}ImageComparer.exe", new Object[]{z1.k5})));
      x8 = z1.k5(z1.l6(n5, d1.n5("BFFValidator{0}BFFValidator.exe", new Object[]{z1.k5})));
      a6 = z1.k5(z1.l6(n5, d1.n5("html2image{0}html2image.exe", new Object[]{z1.k5})));
      n5(z1.k5(z1.l6(var1, "TestDataNet/Lic/Aspose.Total.Product.Family.lic")), var1);
   }

   @Override
   public final void n5(String var1) {
      String var2 = p8.n5("ProgramFiles(x86)") != null ? c8 : t2;
      String var3 = null;
      String[] var4 = new String[]{var3};
      int var5 = w1.n5(var2, d1.n5("\"-f={0}\"", new Object[]{var1}), var4);
      var3 = var4[0];

      for (int var6 = 1;
         (
               d1.c8(var3, "EXCEPTION System.UnauthorizedAccessException during test. Message: Access to the path") != -1
                  || d1.c8(var3, "EXCEPTION System.IO.IOException during test. Message: The process cannot access the file") != -1
            )
            && var6 <= 4;
         var6++
      ) {
         var4[0] = var3;
         var5 = w1.n5(var2, d1.n5("-f=\"{0}\"", new Object[]{var1}), var4);
         var3 = var4[0];
      }

      com.aspose.slides.internal.t9p.l6.n5.println(d1.n5("Result: {0}\n{1}",new Object[]{ var5, var3}));
      com.aspose.slides.internal.r5t.t2.l6(30);
      if (var5 != 0) {
         throw new InvalidOperationException(d1.n5("XPS file {1} does not conform: \n{0}",new Object[]{ var3, var1}));
      }
   }

   @Override
   public final void n5(String var1, String var2, String var3) {
      this.n5(l6, false, var1, var2, var3);
   }

   @Override
   public final void l6(String var1, String var2, int var3, int var4, int var5, boolean var6) {
      super.n5(u3, var1, var2, var3, var4, var5, var6);
   }

   @Override
   public final void n5(String var1, String var2, int var3, int var4, int var5) {
      t4.l6(u9);
      t4.n5(" \"{0}\" \"{1}\" {2} {3} {4}", var1, var2, var3, var4, var5);
      Object var6 = null;
      String[] var7 = new String[]{(String)var6};
      int var8 = w1.n5(u9, d1.n5(" \"{0}\" \"{1}\" {2} {3} {4} 96",new Object[]{ z1.k5(var1), var2, var3, var4, var5}), var7);
      String var9 = var7[0];
      t4.n5("Result: {0}\n{1}", var8, var9);
      if (var8 != 0) {
         throw new InvalidOperationException("Swf2Image execution failed.");
      }
   }

   @Override
   public final void n5(String var1, int var2, String var3, int var4, boolean var5) {
      a6 var6 = new a6();

      try {
         String var7 = z1.k5(h0);
         var6.a6().k5(z1.u9(var7));
         var6.a6().l6(z1.n5(var7));
         var6.a6().n5(d1.n5("png {0} \"{1}\" {2} {3} \"{4}\"",new Object[]{ var4, z1.k5(var1), var2, var5, z1.k5(var3)}));
         var6.a6().n5(true);
         var6.a6().u3(true);
         var6.a6().n5(com.aspose.slides.internal.f8y.t2.n5);
         var6.t2();
         var6.s7();
      } finally {
         if (var6 != null) {
            var6.dispose();
         }
      }
   }

   @Override
   public final boolean l6(String var1) {
      boolean var2 = true;
      String var3 = z1.k5(d1.n5("{0}/{1}.xml",new Object[]{ z1.u9(var1), z1.l6(var1)}));
      a5 var4 = new a5();
      var4.n5(" -l ");
      var4.n5(d1.n5("\"{0}\" ", new Object[]{var3}));
      var4.n5(d1.n5(new String[]{"\"", var1, "\""}));
      a6 var5 = new a6();

      try {
         var5.a6().u3(false);
         var5.a6().l6(x8);
         var5.a6().n5(true);
         var5.a6().n5(var4.toString());
         var5.t2();
         var5.s7();
         switch ((int)(var5.n5() & 4294967295L)) {
            case -2147024809:
               var2 = false;
               break;
            case -536604048:
               var2 = false;
               break;
            case 0:
               if (com.aspose.slides.internal.z0k.u9.k5(var3)) {
                  com.aspose.slides.internal.z0k.u9.l6(var3);
               }
               break;
            default:
               throw new Exception(d1.n5(new String[]{d1.n5("Command line: \"{0} {1}\". Tool exit with code {2} 0x",new Object[]{ x8, var4, var5.n5()}), a3.n5(var5.n5(), "X4")}));
         }
      } finally {
         if (var5 != null) {
            var5.dispose();
         }
      }

      return var2;
   }

   @Override
   public final void n5(String var1, String var2, int var3, int var4, int var5, boolean var6) {
      super.l6(a6, var1, var2, var3, var4, var5, var6);
   }

   @Override
   public final void n5(String var1, String var2, String var3, int var4, int var5, boolean var6) {
      super.n5(a6, var1, var2, var3, var4, var5, var6);
   }
}
