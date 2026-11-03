package com.aspose.slides.internal.w2;

import com.aspose.slides.Collections.Generic.Stack;
import com.aspose.slides.internal.e5.n3;
import com.aspose.slides.internal.z0k.t4;
import com.aspose.slides.ms.System.a3;
import com.aspose.slides.ms.System.d1;
import com.aspose.slides.ms.System.Xml.p5;

public class x8 {
   private u3 n5 = null;
   private a6 l6 = null;

   public final void n5(u3 var1) {
      this.n5 = var1;
   }

   public final void n5(t4 var1, String var2) {
      p5 var3 = new p5(var1);
      var3.h0(1);
      var3.l6(true);
      this.n5(var3, var2);
   }

   public final void n5(p5 var1, String var2) {
      Stack var3 = new Stack();
      h0 var4 = new h0();
      t2 var5 = new t2();

      try {
         String var6 = var1.y1().n5("http://www.w3.org/2000/xmlns/");
         this.n5.l6();
         n3 var7 = com.aspose.slides.internal.v6g.k5.n5(this.n5, n3.class);
         if (var7 != null && var2 != null && var2.length() > 0) {
            var7.n5(var2);
         }

         while (var1.u9()) {
            var4.n5(var1.ah_());
            var4.l6(var1.ai_());
            this.n5.n5(var4);
            switch (var1.s7()) {
               case 1:
                  this.n5(var1, var3, var6);
               case 2:
               case 4:
               case 5:
               case 8:
               case 9:
               case 10:
               case 11:
               case 12:
               case 14:
               default:
                  break;
               case 3:
                  char[] var8 = d1.c8(var1.z1());
                  if (var8.length > 0) {
                     this.n5.n5(var8, 0, var8.length);
                  }

                  if (var1.s7() == 1) {
                     this.n5(var1, var3, var6);
                  }

                  if (var1.s7() == 15) {
                     this.n5(var1, var3);
                  }
                  break;
               case 6:
                  this.n5.k5(var1.x8());
                  break;
               case 7:
                  this.n5.l6(var1.x8(), var1.z1());
                  break;
               case 13:
                  char[] var9 = d1.c8(var1.z1());
                  if (var9.length > 0) {
                     this.n5.l6(var9, 0, var9.length);
                  }
                  break;
               case 15:
                  this.n5(var1, var3);
            }
         }

         this.n5.k5();
      } catch (RuntimeException var10) {
         var5.n5(a3.n5(var1.ah_(), com.aspose.slides.internal.x7n.l6.k5()));
         var5.l6(d1.n5);
         var5.k5(var10.getMessage());
         if (this.l6 == null) {
            throw var10;
         }

         this.l6.n5(var5);
      }
   }

   private void n5(p5 var1, Stack<String> var2, String var3) {
      var2.push(null);
      n5 var4 = new n5();

      while (var1.u3()) {
         if (d1.a6(var1.y4(), var3)) {
            String var5 = d1.n5;
            if ("xmlns".equals(var1.e2())) {
               var5 = var1.n3();
            }

            var2.push(var5);
            this.n5.n5(var5, var1.z1());
         } else {
            s7 var6 = new s7();
            var6.n5 = var1.x8();
            var6.l6 = var1.y4();
            var6.u3 = var1.n3();
            var6.k5 = var1.z1();
            var4.n5.addItem(var6.n5());
         }
      }

      var1.a6();
      this.n5.n5(var1.y4(), var1.n3(), var1.x8(), var4.n5());
      if (var1.m1()) {
         this.n5.n5(var1.y4(), var1.n3(), var1.x8());
      }
   }

   private void n5(p5 var1, Stack<String> var2) {
      this.n5.n5(var1.y4(), var1.n3(), var1.x8());

      for (String var3 = (String)var2.pop(); var3 != null; var3 = (String)var2.pop()) {
         this.n5.l6(var3);
      }
   }
}
