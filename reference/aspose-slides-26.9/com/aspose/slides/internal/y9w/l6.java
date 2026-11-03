package com.aspose.slides.internal.y9w;

import com.aspose.slides.exceptions.InvalidOperationException;
import com.aspose.slides.internal.l7h.j5;
import com.aspose.slides.internal.n2d.t4;
import com.aspose.slides.ms.System.d1;
import com.aspose.slides.ms.System.o0;

public class l6 {
   public String n5;
   public int l6;
   public int k5;
   public long u3;
   public long a6;
   public long u9;
   public o0 h0 = new o0();
   public long c8;
   public long t2;
   public long s7;
   public long x8;
   public long n3;
   public boolean y4;

   public l6() {
      this.l6 = 0;
      this.k5 = 1;
      this.u3 = 4294967295L;
      this.a6 = 4294967295L;
      this.u9 = 4294967295L;
      o0.n5.k5(this.h0);
   }

   public l6(String var1, boolean var2, o0 var3) {
      this();
      this.n5 = var1;
      this.l6 = var2 ? 5 : 1;
      var3.k5(this.h0);
      this.x8 = var2 ? 4294967295L : 0L;
   }

   public l6(String var1, int var2, long var3) {
      this();
      this.n5 = var1;
      this.l6 = var2;
      this.n3 = var3;
      this.x8 = 4294967295L;
   }

   public l6(com.aspose.slides.internal.z0k.n5 var1) {
      int var2 = (int)var1.x8().getPosition();
      byte[] var3 = var1.c8(64);
      if (var3.length >= 64) {
         int var4 = var1.r4() & 65535;
         if (var4 > 0) {
            if (var4 > var3.length) {
               return;
            }

            this.n5 = j5.z1().l6(var3, 0, var4 - 2);
         } else {
            this.n5 = null;
         }

         this.l6 = var1.z1() & 255;
         if (this.l6 == 0) {
            var1.x8().setPosition(var2 + 128);
         } else {
            this.k5 = var1.z1() & 255;
            this.u3 = var1.c4();
            this.a6 = var1.c4();
            this.u9 = var1.c4();
            this.h0 = new o0(var1.c8(16));
            this.c8 = var1.c4();
            this.t2 = var1.z8();
            if (t4.n5(var1, 20)) {
               this.s7 = var1.z8();
               this.x8 = var1.c4();
               this.n3 = var1.c4() & 4294967295L;
               var1.m3();
            }
         }
      }
   }

   public final void n5(com.aspose.slides.internal.z0k.l6 var1) {
      byte[] var2 = new byte[64];
      int var4;
      if (t4.l6(this.n5)) {
         byte[] var3 = j5.z1().u3(this.n5);
         if (var3.length > 62) {
            throw new InvalidOperationException(d1.n5("The name '{0}' is too long for writing to structured storage.", new Object[]{this.n5}));
         }

         com.aspose.slides.ms.System.u3.n5(com.aspose.slides.ms.System.u3.n5((Object)(var3)), 0, com.aspose.slides.ms.System.u3.n5((Object)(var2)), 0, var3.length);
         var4 = var3.length + 2;
      } else {
         var4 = 0;
      }

      var1.n5(var2);
      var1.n5(var4 & 65535);
      var1.n5((byte)this.l6);
      var1.n5((byte)this.k5);
      var1.n5(this.u3 & 4294967295L);
      var1.n5(this.a6 & 4294967295L);
      var1.n5(this.u9 & 4294967295L);
      var1.n5(this.h0.n5());
      var1.n5(this.c8 & 4294967295L);
      var1.l6(this.t2);
      var1.l6(this.s7);
      var1.n5(this.x8 & 4294967295L);
      var1.n5(this.n3 & 4294967295L);
      var1.l6(0);
   }
}
