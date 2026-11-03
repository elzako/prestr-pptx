package com.aspose.slides.internal.a9t;

import com.aspose.slides.exceptions.ArgumentNullException;
import com.aspose.slides.exceptions.ObjectDisposedException;
import com.aspose.slides.internal.l7h.j5;
import com.aspose.slides.internal.o8m.i1;
import com.aspose.slides.internal.o8m.z1;
import com.aspose.slides.ms.System.IDisposable;
import com.aspose.slides.ms.System.d1;
import com.aspose.slides.ms.System.e5;
import com.aspose.slides.ms.System.q1;
import com.aspose.slides.ms.System.y4;

@Deprecated
public class n5 implements IDisposable {
   private static byte[] n5 = new byte[]{75, 71, 83, 33, 64, 35, 36, 37};
   private static byte[] l6 = new byte[]{-86, -45, -76, 53, -75, 20, 4, -18};
   private boolean k5 = false;
   private byte[] u3;
   private byte[] a6 = new byte[21];
   private byte[] u9 = new byte[21];

   public n5() {
   }

   public n5(String var1, byte[] var2) {
      this();
      this.n5(var1);
      this.n5(var2);
   }

   @Override
   protected void finalize() throws Throwable {
      if (!this.k5) {
         this.dispose();
      }

      super.finalize();
   }

   public void n5(String var1) {
      if (this.k5) {
         throw new ObjectDisposedException("too late");
      }

      z1 var2 = z1.k5();
      var2.k5(2);
      i1 var3 = null;
      if (var1 != null && var1.length() >= 1) {
         var2.k5(this.n5(var1, 0));
         var3 = var2.t9();
         var3.n5(n5, 0, 8, this.a6, 0);
      } else {
         y4.n5(l6, 0, this.a6, 0, 8);
      }

      if (var1 != null && var1.length() >= 8) {
         var2.k5(this.n5(var1, 7));
         var3 = var2.t9();
         var3.n5(n5, 0, 8, this.a6, 8);
      } else {
         y4.n5(l6, 0, this.a6, 8, 8);
      }

      com.aspose.slides.internal.x8w.u3 var4 = com.aspose.slides.internal.x8w.u3.a6();
      byte[] var5 = var1 == null ? new byte[0] : j5.z1().u3(var1);
      byte[] var6 = var4.l6(var5);
      y4.n5(var6, 0, this.u9, 0, 16);
      com.aspose.slides.ms.System.u3.n5(var5, 0, var5.length);
      com.aspose.slides.ms.System.u3.n5(var6, 0, var6.length);
      var2.h0();
   }

   public void n5(byte[] var1) {
      if (var1 == null) {
         throw new ArgumentNullException("Challenge");
      }

      if (this.k5) {
         throw new ObjectDisposedException("too late");
      }

      this.u3 = com.aspose.slides.internal.v6g.k5.k5(com.aspose.slides.ms.System.u3.n5((Object)(var1)).deepClone(), byte[].class);
   }

   public byte[] n5() {
      if (this.k5) {
         throw new ObjectDisposedException("too late");
      } else {
         return this.l6(this.a6);
      }
   }

   public byte[] l6() {
      if (this.k5) {
         throw new ObjectDisposedException("too late");
      } else {
         return this.l6(this.u9);
      }
   }

   @Override
   public void dispose() {
      this.n5(true);
      e5.n5(this);
   }

   private void n5(boolean var1) {
      if (!this.k5) {
         com.aspose.slides.ms.System.u3.n5(this.a6, 0, this.a6.length);
         com.aspose.slides.ms.System.u3.n5(this.u9, 0, this.u9.length);
         if (this.u3 != null) {
            com.aspose.slides.ms.System.u3.n5(this.u3, 0, this.u3.length);
         }

         this.k5 = true;
      }
   }

   private byte[] l6(byte[] var1) {
      byte[] var2 = new byte[24];
      z1 var3 = z1.k5();
      var3.k5(2);
      var3.k5(this.n5(var1, 0));
      i1 var4 = var3.t9();
      var4.n5(this.u3, 0, 8, var2, 0);
      var3.k5(this.n5(var1, 7));
      var4 = var3.t9();
      var4.n5(this.u3, 0, 8, var2, 8);
      var3.k5(this.n5(var1, 14));
      var4 = var3.t9();
      var4.n5(this.u3, 0, 8, var2, 16);
      return var2;
   }

   private byte[] n5(byte[] var1, int var2) {
      return new byte[]{
         var1[var2],
         com.aspose.slides.internal.v6g.k5.n5(
            (Object)(com.aspose.slides.internal.v6g.k5.u3(var1[var2], 6) << 7 | com.aspose.slides.internal.v6g.k5.u3(var1[var2 + 1], 6) >> 1), 9
         ),
         com.aspose.slides.internal.v6g.k5.n5(
            (Object)(com.aspose.slides.internal.v6g.k5.u3(var1[var2 + 1], 6) << 6 | com.aspose.slides.internal.v6g.k5.u3(var1[var2 + 2], 6) >> 2), 9
         ),
         com.aspose.slides.internal.v6g.k5.n5(
            (Object)(com.aspose.slides.internal.v6g.k5.u3(var1[var2 + 2], 6) << 5 | com.aspose.slides.internal.v6g.k5.u3(var1[var2 + 3], 6) >> 3), 9
         ),
         com.aspose.slides.internal.v6g.k5.n5(
            (Object)(com.aspose.slides.internal.v6g.k5.u3(var1[var2 + 3], 6) << 4 | com.aspose.slides.internal.v6g.k5.u3(var1[var2 + 4], 6) >> 4), 9
         ),
         com.aspose.slides.internal.v6g.k5.n5(
            (Object)(com.aspose.slides.internal.v6g.k5.u3(var1[var2 + 4], 6) << 3 | com.aspose.slides.internal.v6g.k5.u3(var1[var2 + 5], 6) >> 5), 9
         ),
         com.aspose.slides.internal.v6g.k5.n5(
            (Object)(com.aspose.slides.internal.v6g.k5.u3(var1[var2 + 5], 6) << 2 | com.aspose.slides.internal.v6g.k5.u3(var1[var2 + 6], 6) >> 6), 9
         ),
         com.aspose.slides.internal.v6g.k5.n5((Object)(com.aspose.slides.internal.v6g.k5.u3(var1[var2 + 6], 6) << 1), 9)
      };
   }

   private byte[] n5(String var1, int var2) {
      byte[] var3 = new byte[7];
      int var4 = q1.l6(var1.length() - var2, 7);
      j5.e2().n5(d1.l6(var1, com.aspose.slides.internal.x7n.l6.u3()), var2, var4, var3, 0);
      byte[] var5 = this.n5(var3, 0);
      com.aspose.slides.ms.System.u3.n5(var3, 0, var3.length);
      return var5;
   }
}
