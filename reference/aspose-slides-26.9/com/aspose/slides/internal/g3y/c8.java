package com.aspose.slides.internal.g3y;

import java.io.IOException;
import javax.imageio.stream.ImageInputStream;
import javax.imageio.stream.ImageOutputStream;

class c8 {
   public int n5;
   public int l6;
   public int k5;
   public byte u3;
   public short a6;
   public short u9;
   public int h0;
   public int c8;

   public c8(ImageInputStream var1) throws IOException {
      this.n5 = var1.readUnsignedByte();
      this.l6 = var1.readUnsignedByte();
      this.k5 = var1.readUnsignedByte();
      this.u3 = var1.readByte();
      this.a6 = var1.readShort();
      this.u9 = var1.readShort();
      this.h0 = var1.readInt();
      this.c8 = var1.readInt();
   }

   public c8() {
      this.n5 = 0;
      this.l6 = 0;
      this.k5 = 0;
      this.a6 = 1;
      this.u3 = 0;
      this.u9 = 0;
      this.h0 = 0;
      this.c8 = 0;
   }

   public void n5(ImageOutputStream var1) throws IOException {
      var1.writeByte(this.n5);
      var1.writeByte(this.l6);
      var1.writeByte(this.k5);
      var1.writeByte(this.u3);
      var1.writeShort(this.a6);
      var1.writeShort(this.u9);
      var1.writeInt(this.h0);
      var1.writeInt(this.c8);
   }
}
