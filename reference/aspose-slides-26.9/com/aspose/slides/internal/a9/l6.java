package com.aspose.slides.internal.a9;

import com.aspose.slides.Collections.Generic.IGenericList;
import com.aspose.slides.exceptions.ArgumentNullException;
import com.aspose.slides.exceptions.InvalidOperationException;
import com.aspose.slides.internal.l7h.j5;
import com.aspose.slides.internal.q4.u3;
import com.aspose.slides.internal.w0.z1;
import com.aspose.slides.internal.z0k.t4;
import com.aspose.slides.ms.System.IDisposable;
import com.aspose.slides.ms.System.d1;

public class l6 implements IDisposable {
   private k5 l6 = null;
   public final t4 n5;

   private l6(t4 var1) {
      this.n5 = var1;
   }

   @Override
   public final void dispose() {
   }

   public static l6 n5(t4 var0, com.aspose.slides.internal.w0.t4 var1, IGenericList<z1> var2, byte var3) {
      if (var0 == null) {
         throw new ArgumentNullException("stream");
      }

      byte[] var4 = j5.e2().u3(d1.n5(new String[]{"GIF", "89a"}));
      var0.write(var4, 0, var4.length);
      u3 var6 = new u3();
      var6.n5 = var1.k5 & 65535;
      var6.l6 = var1.u3 & 65535;
      var6.k5 = var3;
      if (var2 != null && var2.size() > 0) {
         var6.u3 = var2.size();
         int[] var5 = new int[]{var6.u3};
         n5(var5);
         var6.u3 = var5[0];
      }

      var6.n5(var0);
      if (var6.u3 > 0) {
         com.aspose.slides.internal.q4.n5.n5(var0, var6.u3, var2, new z1());
      }

      return new l6(var0);
   }

   public final k5 n5(int var1) {
      if (this.l6 != null) {
         throw new InvalidOperationException("GifFrameEncoder begun already.");
      }

      this.n5.writeByte((byte)33);
      this.n5.writeByte((byte)-7);
      com.aspose.slides.internal.q4.l6 var2 = new com.aspose.slides.internal.q4.l6();
      var2.n5 = var1;
      var2.l6 = -1;
      var2.n5(this.n5);
      this.l6 = new k5(this);
      return this.l6;
   }

   public final void n5(k5 var1) {
      if (this.l6 == var1) {
         this.l6 = null;
      }
   }

   public static void n5(int[] var0) {
      if (var0[0] < 2) {
         var0[0] = 2;
      }

      byte var1 = 2;

      while (var1 < var0[0]) {
         var1 *= 2;
      }

      var0[0] = var1;
   }
}
