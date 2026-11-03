package com.aspose.slides;

import com.aspose.slides.Collections.Generic.IGenericEnumerator;
import com.aspose.slides.Collections.Generic.IGenericList;
import com.aspose.slides.ms.System.IDisposable;

class r6v {
   private int n5;
   private String l6;
   private int k5;
   private final IGenericList<q2z> u3;
   private final String a6;
   private int u9;

   public final int n5() {
      return this.n5;
   }

   private void n5(int var1) {
      this.n5 = var1;
   }

   public final String l6() {
      return this.l6;
   }

   private void n5(String var1) {
      this.l6 = var1;
   }

   public final int k5() {
      return this.k5;
   }

   private void l6(int var1) {
      this.k5 = var1;
   }

   public r6v(IGenericList<q2z> var1, String var2) {
      this.u3 = var1;
      this.a6 = com.aspose.slides.ms.System.d1.a6(var2, ' ', '\t');
      this.n5(1);
   }

   public final void u3() {
      if (this.u9 == this.a6.length()) {
         this.n5(0);
         this.n5(null);
         this.l6(this.u9);
      } else {
         int var1 = 1;
         String var2 = null;
         int var3 = 0;
         int var4 = 0;
         IGenericEnumerator var5 = this.u3.iterator();

         try {
            while (var5.hasNext()) {
               q2z var6 = (q2z)var5.next();
               String var7 = com.aspose.slides.ms.System.d1.n5("\\G[\\s\\t]*({0})", new Object[]{var6.l6()});
               com.aspose.slides.internal.r7c.c8 var8 = new com.aspose.slides.internal.r7c.c8(var7);
               com.aspose.slides.internal.r7c.u3 var9 = var8.l6(this.a6, this.u9);
               if (var9.u3()) {
                  String var10 = var9.a6().n5(1).k5();
                  if (!com.aspose.slides.ms.System.d1.n5(var10) && var9.l6() > var4) {
                     var1 = var6.n5();
                     var2 = var10;
                     var3 = this.u9 + var9.l6() - var10.length();
                     var4 = var9.l6();
                  }
               }
            }
         } finally {
            if (com.aspose.slides.internal.v6g.k5.n5(var5, IDisposable.class)) {
               var5.dispose();
            }
         }

         if (var1 == 1) {
            String var14 = "\\G[\\s\\t]*(\\S+)";
            com.aspose.slides.internal.r7c.c8 var15 = new com.aspose.slides.internal.r7c.c8(var14);
            com.aspose.slides.internal.r7c.u3 var16 = var15.l6(this.a6, this.u9);
            String var17 = var16.a6().n5(1).k5();
            var2 = var17;
            var3 = this.u9 + var16.l6() - var17.length();
            var4 = var16.l6();
         }

         this.n5(var1);
         this.n5(var2);
         this.l6(var3);
         if (this.n5() == 1) {
            this.u9 = this.a6.length();
         } else {
            this.u9 += var4;
         }
      }
   }
}
