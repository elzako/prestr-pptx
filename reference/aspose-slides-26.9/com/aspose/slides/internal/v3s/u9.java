package com.aspose.slides.internal.v3s;

import com.aspose.slides.internal.e1x.a5;
import com.aspose.slides.internal.e1x.f0;
import com.aspose.slides.internal.e1x.w1;
import com.aspose.slides.internal.l7h.j5;
import com.aspose.slides.internal.n2d.x8;

public class u9 {
   private int n5;
   private int l6;
   private f0 k5;

   public u9(f0 var1) {
      this.k5 = var1;
   }

   public u9(int var1, int var2, f0 var3) {
      this(var3);
      this.n5 = var1;
      this.l6 = var2;
   }

   public final f0 u3() {
      return this.k5;
   }

   public final int a6() {
      return this.n5;
   }

   public final int u9() {
      return this.l6;
   }

   public void n5(com.aspose.slides.internal.n2d.k5 var1) {
   }

   public void n5(com.aspose.slides.internal.n2d.u3 var1) {
   }

   public a5 n5(w1 var1) {
      return null;
   }

   public final boolean h0() {
      return (this.n5 & 65535) != 3 || (this.l6 & 65535) != 4;
   }

   public final byte[] l6(int var1) {
      if ((this.n5 & 65535) == 3 && (this.l6 & 65535) == 4) {
         j5 var2 = x8.n5("big5");
         byte[] var3 = j5.z1().l6(new char[]{(char)(var1 & 65535)});
         return j5.n5(j5.z1(), var2, var3);
      } else {
         return com.aspose.slides.ms.System.x8.n5((short)var1);
      }
   }

   public int n5(int var1) {
      return 0;
   }
}
