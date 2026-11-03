package com.aspose.slides.internal.x1f;

import com.aspose.slides.internal.c4i.e5;
import com.aspose.slides.internal.n2z.k5;
import com.aspose.slides.internal.p7x.l6;
import java.io.IOException;
import java.util.List;

public final class n5 extends k5 {
   int n5;
   byte[] l6;
   private int k5;
   private List<e5> u3;

   @Override
   public void n5(byte[] var1, int var2, int var3) throws l6, IOException {
      this.n5 = com.aspose.slides.internal.l1b.k5.u3(var1, var2);
      var2 += 4;
      if (this.n5 > var3 - 4) {
         throw new IOException("Error reading GDI Comment record");
      }

      this.l6 = new byte[this.n5];
      System.arraycopy(var1, var2, this.l6, 0, this.n5);
      this.k5 = this.l6[0] & 255 | (this.l6[1] & 255) << 8 | (this.l6[2] & 255) << 16 | (this.l6[3] & 255) << 24;
   }

   @Override
   public int n5() {
      return 70;
   }

   @Override
   protected void n5(com.aspose.slides.internal.o6t.l6 var1, com.aspose.slides.internal.m5l.k5 var2, int var3) throws l6 {
   }

   public int l6() {
      return this.n5;
   }

   public void n5(int var1) {
      this.n5 = var1;
   }

   public byte[] k5() {
      return this.l6;
   }

   public void n5(byte[] var1) {
      this.l6 = var1;
   }

   public List<e5> u3() {
      return this.u3;
   }

   public boolean a6() {
      return this.k5 == 726027589;
   }

   public void u9() {
      this.u3 = com.aspose.slides.internal.k4o.l6.n5(this);
   }
}
