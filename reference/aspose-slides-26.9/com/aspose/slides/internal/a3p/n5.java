package com.aspose.slides.internal.a3p;

import com.aspose.slides.exceptions.ArgumentException;
import com.aspose.slides.exceptions.ArgumentNullException;
import com.aspose.slides.internal.l7h.j5;
import com.aspose.slides.ms.System.q1;

public final class n5 extends com.aspose.slides.internal.u2w.a6 {
   private String n5;

   public n5(int var1) {
      super(var1);
   }

   public final String x8() {
      return this.n5;
   }

   public final void n5(String var1) {
      this.n5 = var1;
   }

   @Override
   public long n5() {
      long var1 = 1L;
      if (this.n5 != null) {
         var1 += j5.k5("Latin1").n5(this.n5);
      }

      return var1;
   }

   @Override
   public int u3() {
      return 2;
   }

   @Override
   public long u9() {
      long var1 = this.n5();
      if (var1 <= 4L) {
         var1 = 0L;
      }

      return var1;
   }

   @Override
   public Object h0() {
      return this.n5;
   }

   @Override
   public void n5(Object var1) {
      if (var1 != null && !com.aspose.slides.internal.v6g.k5.l6(var1, String.class)) {
         throw new ArgumentException("Only string is supported.");
      }

      this.n5 = com.aspose.slides.internal.v6g.k5.n5(var1, String.class);
   }

   @Override
   public long n5(com.aspose.slides.internal.v6s.a6 var1) {
      if (var1 == null) {
         throw new ArgumentNullException("dataStream");
      }

      long var2 = 0L;
      if (this.n5() > 4L) {
         var2 = this.l6(var1);
      }

      return var2;
   }

   @Override
   protected void n5(com.aspose.slides.internal.v6s.u3 var1, long var2, long var4) {
      byte[] var6 = null;
      if (var4 > 4L) {
         long var7 = var1.n5(var2);
         if (var7 + var4 <= var1.n5()) {
            var6 = var1.n5(var7, var4);
         }
      } else {
         var6 = var1.n5(var2, 4L);
      }

      if (var6 != null) {
         int var9 = (int)var4 - 1;
         if (var9 >= 0) {
            this.n5 = j5.k5("Latin1").l6(var6, 0, var9);
         }
      }
   }

   @Override
   protected void l6(com.aspose.slides.internal.v6s.a6 var1, long var2) {
      if (this.n5() > 4L) {
         var1.l6(var2);
      } else {
         this.l6(var1);
      }
   }

   @Override
   protected com.aspose.slides.internal.u2w.a6 s7() {
      return new n5(this.k5());
   }

   @Override
   protected void n5(com.aspose.slides.internal.u2w.a6 var1) {
      ((n5)var1).n5 = this.n5;
      super.n5(var1);
   }

   private long l6(com.aspose.slides.internal.v6s.a6 var1) {
      long var4;
      if (this.n5 != null) {
         byte[] var2 = j5.k5("Latin1").u3(this.n5);
         var1.n5(var2);
         int var3 = q1.n5(1, 4 - var2.length);
         var1.n5(new byte[var3]);
         var4 = var2.length + var3;
      } else {
         var1.n5(new byte[4]);
         var4 = 4L;
      }

      return var4;
   }
}
