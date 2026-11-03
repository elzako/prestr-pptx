package com.aspose.slides.internal.s8x;

import com.aspose.slides.exceptions.Exception;
import com.aspose.slides.exceptions.InvalidOperationException;
import com.aspose.slides.internal.f8y.a6;
import com.aspose.slides.internal.l7h.a5;
import com.aspose.slides.internal.n2d.w1;
import com.aspose.slides.internal.z0k.z1;
import com.aspose.slides.ms.System.d1;

public class l6 {
   private static String n5;

   protected final void n5(String var1, boolean var2, String var3, String var4, String var5) {
      String var6 = d1.n5(var5) ? d1.n5("-cl {0} \"{1}\"",new Object[]{ var4, var3}) : d1.n5("-cl {0} -pw {2} \"{1}\"",new Object[]{ var4, var3, var5});
      com.aspose.slides.internal.t9p.l6.n5.println(var1);
      com.aspose.slides.internal.t9p.l6.n5.println(var6);
      var6 = n5(var6, null);
      String var7 = d1.n5;
      String[] var8 = new String[]{var7};
      int var9 = w1.n5(var1, var6, var8);
      var7 = var8[0];
      com.aspose.slides.internal.t9p.l6.n5.println(d1.n5("Result: {0}\n{1}",new Object[]{ var9, var7}));
      if (var9 != 0) {
         throw new InvalidOperationException(
            d1.n5("PDF file does not conform to {0}. \r\nFile: {1} \r\nValidator exit code: {2}. \r\nValidator message: {3}",new Object[]{ var4, var3, var9, var7})
         );
      }
   }

   protected final void n5(String var1, String var2, String var3, int var4, int var5, int var6, boolean var7) {
      a5 var8 = new a5();
      var8.n5("--format bmp ");
      var8.n5(d1.n5("--pages {0} ", new Object[]{var4}));
      var8.n5(d1.n5("--output \"{0}\" ", new Object[]{z1.u9(var3)}));
      var8.n5(d1.n5("--prefix \"{0}\" ", new Object[]{z1.l6(var3)}));
      var8.n5(d1.n5("--hres {0} ", new Object[]{var5}));
      var8.n5(d1.n5("--vres {0} ", new Object[]{var6}));
      var8.n5("--quality 100 ");
      if (!var7) {
         var8.n5("--nosmooth ");
      }

      var8.n5("--noprompt ");
      var8.n5(d1.n5("\"{0}\" ", new Object[]{var2}));
      a6 var9 = new a6();

      try {
         var9.a6().u3(false);
         var9.a6().l6(var1);
         var9.a6().n5(true);
         var9.a6().n5(var8.toString());
         var9.t2();
         var9.s7();
         if (0 != var9.n5()) {
            throw new Exception(d1.n5("Command line: \"{0} {1}\". Tool exit with code {2}",new Object[]{ var1, var8, var9.n5()}));
         }
      } finally {
         if (var9 != null) {
            var9.dispose();
         }
      }
   }

   public static String n5(String var0, String var1) {
      if (var1 != null) {
         n5 = z1.k5(z1.l6(var1, "TestDataNet/Lic/Aspose.Total.Product.Family.lic"));
      }

      return d1.n5("{0} -lk \"{1}\"",new Object[]{ var0, n5});
   }

   public final void l6(String var1, String var2, String var3, int var4, int var5, int var6, boolean var7) {
      this.n5(var1, var2, var3, d1.n5("slide-{0}{1} ",new Object[]{ var4 + 1, var7 ? "-notes" : ""}), var5, var6, var7);
   }

   public final void n5(String var1, String var2, String var3, String var4, int var5, int var6, boolean var7) {
      a5 var8 = new a5();
      var8.n5("--format png ");
      var8.n5(d1.n5("--element #{0} ", new Object[]{var4}));
      var8.n5(d1.n5("--output \"{0}\" ", new Object[]{z1.u9(var3)}));
      var8.n5(d1.n5("--prefix \"{0}\" ", new Object[]{z1.l6(var3)}));
      var8.n5(d1.n5("--hres {0} ", new Object[]{var5}));
      var8.n5(d1.n5("--vres {0} ", new Object[]{var6}));
      var8.n5(d1.n5("\"{0}\" ", new Object[]{var2}));
      a6 var9 = new a6();

      try {
         var9.a6().u3(false);
         var9.a6().l6(var1);
         var9.a6().n5(true);
         var9.a6().n5(var8.toString());
         var9.t2();
         var9.s7();
         if (0 != var9.n5()) {
            throw new Exception(d1.n5("Command line: \"{0} {1}\". Tool exit with code {2}",new Object[]{ var1, var8, var9.n5()}));
         }
      } finally {
         if (var9 != null) {
            var9.dispose();
         }
      }
   }
}
