package com.aspose.slides.internal.g3y;

import java.io.IOException;
import javax.imageio.stream.ImageInputStream;
import javax.imageio.stream.ImageOutputStream;

class k5 {
   public int n5;
   public int l6;
   public int k5;
   public short u3;
   public short a6;
   public int u9;
   public int h0;
   public int c8;
   public int t2;
   public int s7;
   public int x8;
   public int n3;

   public k5() {
      this.n5 = 40;
      this.l6 = 0;
      this.k5 = 0;
      this.u3 = 1;
      this.a6 = 0;
      this.n3 = 0;
      this.u9 = 0;
      this.h0 = 0;
      this.c8 = 0;
      this.t2 = 0;
      this.s7 = 0;
      this.x8 = 0;
   }

   k5 n5() {
      k5 var1 = new k5();
      var1.a6 = this.a6;
      var1.u3 = this.u3;
      var1.x8 = this.x8;
      var1.s7 = this.s7;
      var1.u9 = this.u9;
      var1.h0 = this.h0;
      var1.n3 = this.n3;
      var1.k5 = this.k5;
      var1.l6 = this.l6;
      var1.n5 = this.n5;
      var1.c8 = this.c8;
      var1.t2 = this.t2;
      return var1;
   }

   public k5(ImageInputStream var1, int var2) throws IOException {
      this.n5(var1, var2);
   }

   protected void n5(ImageInputStream var1, int var2) throws IOException {
      this.n5 = var2;
      this.l6 = Math.abs(var1.readInt());
      this.k5 = Math.abs(var1.readInt());
      this.u3 = var1.readShort();
      this.a6 = var1.readShort();
      this.n3 = (int)Math.pow(2.0, this.a6);
      this.u9 = var1.readInt();
      this.h0 = var1.readInt();
      this.c8 = var1.readInt();
      this.t2 = var1.readInt();
      this.s7 = var1.readInt();
      this.x8 = var1.readInt();
   }

   public void n5(ImageOutputStream var1) throws IOException {
      var1.writeInt(l6(this.n5));
      var1.writeInt(l6(this.l6));
      var1.writeInt(l6(this.k5));
      var1.writeShort(n5(this.u3));
      var1.writeShort(n5(this.a6));
      var1.writeInt(l6(this.u9));
      var1.writeInt(l6(this.h0));
      var1.writeInt(l6(this.c8));
      var1.writeInt(l6(this.t2));
      var1.writeInt(l6(this.s7));
      var1.writeInt(l6(this.x8));
   }

   public static int n5(int var0) {
      return var0;
   }

   public static int l6(int var0) {
      return var0;
   }
}
