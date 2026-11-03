package com.aspose.slides.internal.u2w;

import com.aspose.slides.exceptions.ArgumentNullException;
import com.aspose.slides.exceptions.ArgumentOutOfRangeException;
import com.aspose.slides.exceptions.NotImplementedException;
import com.aspose.slides.internal.b8u.q0;
import com.aspose.slides.internal.b8u.t9;
import com.aspose.slides.internal.b8u.x8;
import com.aspose.slides.internal.o9b.y2;
import com.aspose.slides.internal.o9n.n3;
import com.aspose.slides.internal.r1x.d2;
import com.aspose.slides.internal.r1x.j4;
import com.aspose.slides.internal.r1x.v3;
import com.aspose.slides.internal.r1x.z6;
import com.aspose.slides.internal.z0k.t4;
import com.aspose.slides.ms.System.d1;
import com.aspose.slides.ms.System.s3;

public class u3 implements q0 {
   private final int n5;
   private final int l6;
   private com.aspose.slides.internal.f2i.n5 k5;
   private final t4 u3;
   private final d2 a6;
   private final l6 u9;
   private u9 h0;

   public u3(com.aspose.slides.internal.f2i.n5 var1, int var2, int var3, t4 var4, d2 var5) {
      if (var1 == null) {
         throw new ArgumentNullException("dataOptions");
      }

      if (var4 == null) {
         throw new ArgumentNullException("dataStream");
      }

      this.n5(var1);
      this.u3 = var4;
      this.n5 = var2;
      this.l6 = var3;
      this.a6 = var5;
      this.u9 = this.n5(var5);
   }

   public final com.aspose.slides.internal.f2i.n5 n5() {
      return this.k5;
   }

   @Override
   public final boolean a0() {
      return false;
   }

   public final void n5(u9 var1) {
      if (this.h0 != var1) {
         this.h0 = var1;
         this.u9.n5(var1);
      }
   }

   public final l6 l6() {
      return this.u9;
   }

   @Override
   public final void l6(y2 var1, x8 var2) {
      synchronized (j4.n5(this.u3)) {
         boolean var4 = false;
         this.u3.seek(0L, 0);
         v3 var5 = new v3(this.u3);

         try {
            com.aspose.slides.internal.v6s.u3 var6 = com.aspose.slides.internal.v6s.k5.l6(var5, this.k5.q0());
            l6 var7 = this.n5(this.a6);
            var7.n5(this.h0);
            com.aspose.slides.internal.q0g.n5.n5(var7, this.l6(), null, null);
            var7.n5(var6, var1.n3(), var2);
            var4 = true;
         } finally {
            if (var5 != null) {
               if (!var4) {
                  var5.n5(true);
               }

               var5.dispose();
            }
         }
      }
   }

   @Override
   public final void n5(y2 var1, z6 var2, t9 var3) {
      throw new NotImplementedException();
   }

   private l6 n5(d2 var1) {
      l6 var2;
      switch (this.k5.m3()) {
         case 1:
            var2 = new n3(this.k5, this.n5, this.l6, this.a6);
            break;
         case 2:
         case 3:
         case 4:
            var2 = new com.aspose.slides.internal.o9n.n5(this.k5, this.n5, this.l6, this.a6);
            break;
         case 5:
            com.aspose.slides.internal.o9n.u3 var3 = new com.aspose.slides.internal.o9n.u3(this.k5, this.n5, this.l6, this.a6);
            var3.k5(this.k5.o0());
            var3.a6(this.k5.s3() & 65535);
            var3.l6(this.k5.k7()[0] & 65535);
            var3.u3(this.n5 * (this.k5.s3() & 65535));
            var3.n5(8);
            var2 = var3;
            break;
         case 6:
            var2 = new com.aspose.slides.internal.o9n.a6(this.k5, this.n5, this.l6, var1);
            break;
         case 7:
            var2 = new com.aspose.slides.internal.o9n.k5(this.k5, this.n5, this.l6, var1);
            break;
         case 8:
         case 32946:
            boolean var4 = true;
            com.aspose.slides.internal.o9n.l6 var5 = new com.aspose.slides.internal.o9n.l6(this.k5, this.n5, this.l6, this.a6, true);
            var5.k5(this.k5.o0());
            var5.a6(this.k5.s3() & 65535);
            var5.l6(this.k5.k7()[0] & 65535);
            var5.u3(this.n5 * (this.k5.s3() & 65535));
            var2 = var5;
            break;
         case 32773:
            com.aspose.slides.internal.o9n.u9 var6 = new com.aspose.slides.internal.o9n.u9(this.k5, this.n5, this.l6, this.a6);
            var6.k5(this.k5.o0());
            var6.a6(this.k5.s3() & 65535);
            var6.l6(this.k5.k7()[0] & 65535);
            var6.u3(this.n5 * (this.k5.s3() & 65535));
            var2 = var6;
            break;
         default:
            throw new ArgumentOutOfRangeException(d1.n5(new String[]{"codec not supported - Codec #", s3.n5(com.aspose.slides.internal.w2a.a6.class, this.k5.m3())}));
      }

      return var2;
   }

   private void n5(com.aspose.slides.internal.f2i.n5 var1) {
      this.k5 = var1;
   }
}
