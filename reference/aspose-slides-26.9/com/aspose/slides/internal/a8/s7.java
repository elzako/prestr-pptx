package com.aspose.slides.internal.a8;

import com.aspose.slides.internal.z0k.t4;
import com.aspose.slides.ms.System.IDisposable;
import com.aspose.slides.ms.System.d1;
import com.aspose.slides.ms.System.e5;
import com.aspose.slides.ms.System.Xml.l1;

public class s7 implements IDisposable {
   private l1 n5;
   private u9 l6;

   public s7(t4 var1) {
      this(var1, n3.a6());
   }

   public s7(t4 var1, n3 var2) {
      this.n5 = l1.n5(var1, var2.u9());
   }

   public final u9 n5() {
      return this.l6;
   }

   public final void n5(u9 var1) {
      this.l6 = var1;
   }

   public final void l6() {
      this.n5.u9();
   }

   public final void n5(String var1, String var2, String var3, String var4) {
      this.n5.n5(var1, var2, var3, var4);
   }

   public final void n5(String var1, String var2) {
      if (this.n5() != null) {
         this.n5().n5(var1);
      }

      this.n5.k5(var1, var2);
   }

   public final void n5(String var1, String var2, String var3) {
      if (this.n5() != null) {
         this.n5().n5(var2);
      }

      this.n5.n5(var1, var2, var3);
   }

   public final void k5() {
      this.n5.s7();
      if (this.n5() != null) {
         this.n5().l6();
      }
   }

   public final void u3() {
      this.n5.x8();
      if (this.n5() != null) {
         this.n5().l6();
      }
   }

   public final void l6(String var1, String var2) {
      var2 = this.l6(var2);
      this.n5.u3(var1, var2);
   }

   public final void n5(String var1) {
      if (var1.length() != 0) {
         var1 = this.l6(var1);
         if (var1.length() != 0) {
            this.n5.a_(d1.c8(var1), 0, var1.length());
         }
      }
   }

   private String l6(String var1) {
      if (var1 == null) {
         return null;
      }

      com.aspose.slides.internal.r7c.c8 var2 = new com.aspose.slides.internal.r7c.c8(
         "[^\\u0009\\u000A\\u000D\\u0020-\\uD7FF\\uE000-\\uFFFD\\u10000-\\u10FFFF]", 0
      );
      return var2.k5(var1, d1.n5);
   }

   protected void n5(boolean var1) {
      if (var1 && this.n5 != null) {
         this.n5.dispose();
         this.n5 = null;
      }
   }

   @Override
   public final void dispose() {
      this.n5(true);
      e5.n5(this);
   }
}
