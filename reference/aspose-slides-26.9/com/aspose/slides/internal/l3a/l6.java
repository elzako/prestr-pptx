package com.aspose.slides.internal.l3a;

import com.aspose.slides.exceptions.ArgumentException;
import com.aspose.slides.exceptions.ArgumentNullException;
import com.aspose.slides.ms.System.d1;
import com.aspose.slides.ms.System.j5;
import com.aspose.slides.ms.System.s4;

public final class l6 extends com.aspose.slides.internal.g4d.l6 {
   private final String[] n5 = new String[]{
      "yyyy",
      "yyyy-MM",
      "yyyy-MM-dd",
      "yyyy-MM-dd HH:mm",
      "yyyy-MM-dd HH:mm:ss",
      "yyyy-MM-ddTHH:mmTZD",
      "yyyy-MM-ddTHH:mm:ssTZD",
      "yyyy-MM-ddTHH:mm:ss.sTZD",
      "yyyy-MM-ddTHH:mm:ss"
   };
   private String l6;
   private j5 k5 = new j5();

   public l6(j5 var1) {
      this.n5(var1.m3());
      this.l6 = "yyyy-MM-dd";
   }

   public l6(String var1) {
      if (d1.n5(var1)) {
         throw new ArgumentNullException("dateString");
      }

      boolean var2 = false;
      j5 var3 = new j5();
      j5[] var4 = new j5[]{var3};
      String[] var5 = new String[]{this.l6};
      boolean var6 = this.n5(var1, var4, var5);
      var4[0].u3(var3);
      this.l6 = var5[0];
      if (var6) {
         this.n5(var3.m3());
         var2 = true;
      } else if (d1.t2(var1, d1.n5('T', 1))) {
         String[] var7 = d1.u9(var1, 'T');
         if (var7.length == 2) {
            j5 var8 = new j5();
            String var9 = null;
            j5[] var10 = new j5[]{var8};
            String[] var11 = new String[]{var9};
            boolean var12 = this.n5(var7[0], var10, var11);
            var10[0].u3(var8);
            var9 = var11[0];
            if (var12) {
               if (d1.t2(var7[1], d1.n5('-', 1))) {
                  this.l6 = "yyyy-MM-ddTHH:mm:ssTZD";
                  String[] var13 = d1.u9(var7[1], '-');
                  if (var13.length == 2) {
                     s4 var14 = new s4();

                     try {
                        s4.n5(var13[1]).u3(var14);
                     } catch (RuntimeException var16) {
                        var2 = false;
                     }
                  }
               } else {
                  s4 var18 = s4.n5(var7[1]).n3();
                  this.n5(var8.n5(var18.n3()).m3());
                  var2 = true;
               }
            }
         }
      }

      if (!var2) {
         throw new ArgumentException(d1.n5("Invalid date format: {0}", new Object[]{var1}), "dateString");
      }
   }

   public final j5 l6() {
      return this.k5.m3();
   }

   void n5(j5 var1) {
      this.k5 = var1.m3();
   }

   @Override
   public String n5() {
      return this.l6 == null ? this.l6().toString() : this.l6().n5(this.l6);
   }

   private boolean n5(String var1, j5[] var2, String[] var3) {
      j5.l6.u3(var2[0]);
      var3[0] = null;
      j5 var4 = j5.l6.m3();

      for (String var8 : this.n5) {
         j5[] var9 = new j5[]{var4};
         boolean var10 = !j5.n5(var1, var8, com.aspose.slides.internal.x7n.l6.k5(), 0, var9);
         var9[0].u3(var4);
         if (!var10) {
            var3[0] = var8;
            var4.u3(var2[0]);
            return true;
         }
      }

      try {
         j5.n5(var1, com.aspose.slides.internal.x7n.l6.k5(), 128).u3(var4);
      } catch (RuntimeException var11) {
         return false;
      }

      var3[0] = "yyyy-MM-ddTHH:mm:ssZ";
      var4.u3(var2[0]);
      return true;
   }
}
