package com.aspose.slides.internal.c9t;

import java.io.IOException;
import javax.imageio.stream.ImageInputStream;
import javax.imageio.stream.ImageOutputStream;

class n3 {
   public long n5;
   public int l6;
   public int k5;
   public int u3;
   public int a6;
   public long u9;
   public long h0;
   public int c8;
   public int t2;
   public long s7;
   public long x8;
   public int n3;
   public int y4;
   public int e2;
   public int t9;
   public long z1;
   public int t4;
   public int q0;
   public int z3;
   public int m1;
   public int k7;
   public int m3;
   public int z8;
   public int j5;
   public int w1;
   public long r4;
   public long c4;
   public long y2;
   public boolean y1;
   public byte[] a0;
   public int d2;
   int d5 = 0;
   int s3 = 0;
   public int p8;

   public n3() {
      this.n5 = 40L;
      this.l6 = 0;
      this.k5 = 0;
      this.y1 = true;
      this.u3 = 1;
      this.a6 = 0;
      this.d2 = 0;
      this.u9 = 0L;
      this.h0 = 0L;
      this.c8 = 0;
      this.t2 = 0;
      this.s7 = 0L;
      this.x8 = 0L;
   }

   public n3(ImageInputStream var1, u3 var2) throws IOException {
      this.n5 = var1.readInt();
      if (this.n5 == 12L) {
         this.l6 = var1.readShort();
         this.k5 = var1.readShort();
      } else {
         this.l6 = var1.readInt();
         this.k5 = var1.readInt();
      }

      if (this.k5 > 0) {
         this.y1 = true;
      } else {
         this.y1 = false;
         this.k5 = -this.k5;
      }

      this.u3 = var1.readShort();
      this.a6 = var1.readShort();
      this.d2 = 1 << this.a6;
      if (this.n5 == 12L) {
         this.n5(var1, var2);
      } else {
         this.u9 = var1.readUnsignedInt();
         this.h0 = var1.readUnsignedInt();
         this.c8 = var1.readInt();
         this.t2 = var1.readInt();
         this.s7 = var1.readUnsignedInt();
         this.x8 = var1.readUnsignedInt();
         if (this.n5 == 40L) {
            this.l6(var1, var2);
         } else {
            if (this.n5 != 108L && this.n5 != 124L) {
               throw new RuntimeException("Invalid length of data");
            }

            this.k5(var1, var2);
         }
      }
   }

   private void n5(ImageInputStream var1, u3 var2) throws IOException {
      if (this.a6 == 1) {
         this.p8 = 0;
      } else if (this.a6 == 4) {
         this.p8 = 1;
      } else if (this.a6 == 8) {
         this.p8 = 2;
      } else if (this.a6 == 24) {
         this.p8 = 3;
      }

      int var3 = (int)((var2.u3 - 14L - this.n5) / 3L);
      int var4 = var3 * 3;
      this.n5(var1, var4);
   }

   private void n5(ImageInputStream var1, int var2) throws IOException {
      this.a0 = new byte[var2];
      var1.readFully(this.a0, 0, var2);
   }

   private void l6(ImageInputStream var1, u3 var2) throws IOException {
      switch ((int)this.u9) {
         case 0:
         case 1:
         case 2:
            int var3 = (int)((var2.u3 - 14L - this.n5) / 4L);
            int var4 = var3 * 4;
            this.n5(var1, var4);
            if (this.a6 == 1) {
               this.p8 = 4;
            } else if (this.a6 == 4) {
               this.p8 = 5;
            } else if (this.a6 == 8) {
               this.p8 = 6;
            } else if (this.a6 == 24) {
               this.p8 = 7;
            } else if (this.a6 == 16) {
               this.p8 = 8;
               this.n3 = 31744;
               this.y4 = 992;
               this.e2 = 31;
            } else if (this.a6 == 32) {
               this.p8 = 9;
               this.n3 = 16711680;
               this.y4 = 65280;
               this.e2 = 255;
            }
            break;
         case 3:
            if (this.a6 == 16) {
               this.p8 = 8;
            } else if (this.a6 == 32) {
               this.p8 = 9;
            }

            this.n3 = (int)var1.readUnsignedInt();
            this.y4 = (int)var1.readUnsignedInt();
            this.e2 = (int)var1.readUnsignedInt();
            if (this.s7 != 0L) {
               this.n5(var1, (int)this.s7 * 4);
            }
            break;
         case 4:
         case 5:
            this.p8 = 16;
            break;
         default:
            throw new RuntimeException("Invalid compression");
      }
   }

   private void k5(ImageInputStream var1, u3 var2) throws IOException {
      this.n3 = (int)var1.readUnsignedInt();
      this.y4 = (int)var1.readUnsignedInt();
      this.e2 = (int)var1.readUnsignedInt();
      this.t9 = (int)var1.readUnsignedInt();
      this.z1 = var1.readUnsignedInt();
      this.t4 = var1.readInt();
      this.q0 = var1.readInt();
      this.z3 = var1.readInt();
      this.m1 = var1.readInt();
      this.k7 = var1.readInt();
      this.m3 = var1.readInt();
      this.z8 = var1.readInt();
      this.j5 = var1.readInt();
      this.w1 = var1.readInt();
      this.r4 = var1.readUnsignedInt();
      this.c4 = var1.readUnsignedInt();
      this.y2 = var1.readUnsignedInt();
      if (this.n5 == 124L) {
         var1.skipBytes(4);
         this.d5 = var1.readInt();
         this.s3 = var1.readInt();
         var1.skipBytes(4);
      }

      int var3 = (int)((var2.u3 - 14L - this.n5) / 4L);
      int var4 = var3 * 4;
      this.n5(var1, var4);
      switch ((int)this.u9) {
         case 4:
         case 5:
            if (this.n5 == 108L) {
               this.p8 = 17;
            } else if (this.n5 == 124L) {
               this.p8 = 18;
            }
            break;
         default:
            if (this.a6 == 1) {
               this.p8 = 10;
            } else if (this.a6 == 4) {
               this.p8 = 11;
            } else if (this.a6 == 8) {
               this.p8 = 12;
            } else if (this.a6 == 16) {
               this.p8 = 13;
               if ((int)this.u9 == 0) {
                  this.n3 = 31744;
                  this.y4 = 992;
                  this.e2 = 31;
               }
            } else if (this.a6 == 24) {
               this.p8 = 14;
            } else if (this.a6 == 32) {
               this.p8 = 15;
               if ((int)this.u9 == 0) {
                  this.n3 = 16711680;
                  this.y4 = 65280;
                  this.e2 = 255;
               }
            }
      }
   }

   public void n5(ImageOutputStream var1) throws IOException {
      var1.writeInt((int)this.n5);
      var1.writeInt(this.l6);
      var1.writeInt(this.k5);
      var1.writeShort(this.u3);
      var1.writeShort(this.a6);
      var1.writeInt((int)this.u9);
      var1.writeInt((int)this.h0);
      var1.writeInt(this.c8);
      var1.writeInt(this.t2);
      var1.writeInt((int)this.s7);
      var1.writeInt((int)this.x8);
   }
}
