package com.aspose.slides.internal.t6w;

import com.aspose.slides.internal.l7h.j5;
import com.aspose.slides.internal.q9r.c4;
import com.aspose.slides.internal.q9r.s7;
import com.aspose.slides.internal.q9r.t2;
import com.aspose.slides.ms.System.x8;

public class c8 {
   private int n5;
   private int l6;
   private s7 k5;

   public c8(s7 var1) {
      this.k5 = var1;
   }

   public c8(int var1, int var2, s7 var3) {
      this(var3);
      this.n5 = var1;
      this.l6 = var2;
   }

   public final s7 n5() {
      return this.k5;
   }

   public final int l6() {
      return this.n5;
   }

   public final int k5() {
      return this.l6;
   }

   public void n5(com.aspose.slides.internal.z5z.n5 var1) {
   }

   public t2 n5(c4 var1) {
      return null;
   }

   public final boolean u3() {
      return (this.n5 & 65535) != 3 || (this.l6 & 65535) != 4;
   }

   public final byte[] l6(int var1) {
      if ((this.n5 & 65535) == 3 && (this.l6 & 65535) == 4) {
         j5 var2 = j5.k5("big5");
         byte[] var3 = j5.z1().l6(new char[]{(char)(var1 & 65535)});
         return j5.n5(j5.z1(), var2, var3);
      } else {
         return x8.n5((short)var1);
      }
   }

   public int n5(int var1) {
      return 0;
   }
}
