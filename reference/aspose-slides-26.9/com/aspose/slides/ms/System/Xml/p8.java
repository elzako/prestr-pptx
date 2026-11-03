package com.aspose.slides.ms.System.Xml;

import com.aspose.slides.exceptions.InvalidOperationException;

public class p8 extends o6 {
   protected c8 n5;
   protected long l6;
   private long c4;
   private boolean y2;
   private byte[] y1;
   private String a0;
   private boolean d2;
   protected static f5 k5;
   protected static f5 u3;

   public p8(com.aspose.slides.internal.z0k.t4 var1, y7 var2) {
      super(var1, var2);
      this.n5(var2);
   }

   @Override
   public void n5(int var1) {
   }

   @Override
   public void n5(String var1) {
   }

   @Override
   public void n5(String var1, String var2, String var3, String var4) {
      this.s7("<!DOCTYPE ");
      if ("HTML".equals(var1)) {
         this.s7("HTML");
      } else {
         this.s7("html");
      }

      if (var2 != null) {
         this.s7(" PUBLIC \"");
         this.s7(var2);
         if (var3 != null) {
            this.s7("\" \"");
            this.s7(var3);
         }

         this.a6[this.t2++] = 34;
      } else if (var3 != null) {
         this.s7(" SYSTEM \"");
         this.s7(var3);
         this.a6[this.t2++] = 34;
      } else {
         this.a6[this.t2++] = 32;
      }

      if (var4 != null) {
         this.a6[this.t2++] = 91;
         this.s7(var4);
         this.a6[this.t2++] = 93;
      }

      this.a6[this.t2++] = 62;
   }

   @Override
   public void n5(String var1, String var2, String var3) {
      this.n5.n5((byte)this.l6);
      if (var3.length() == 0) {
         this.l6 = k5.n5(var2) & 0xFF;
         super.a6[this.t2++] = 60;
         super.s7(var2);
         super.y4 = this.t2;
      } else {
         this.l6 = 128L;
         super.n5(var1, var2, var3);
      }
   }

   @Override
   public void n5() {
      super.a6[super.t2++] = 62;
      this.x8 = this.t2;
      if ((this.l6 & 32L) != 0L) {
         this.k5();
      }
   }

   @Override
   public void l6(String var1, String var2, String var3) {
      if (var3.length() == 0) {
         if ((this.l6 & 8L) == 0L) {
            this.a6[super.t2++] = 60;
            this.a6[super.t2++] = 47;
            super.s7(var2);
            this.a6[super.t2++] = 62;
         }
      } else {
         super.l6(var1, var2, var3);
      }

      this.l6 = this.n5.n5() & 0xFF;
   }

   @Override
   public void k5(String var1, String var2, String var3) {
      if (var3.length() == 0) {
         if ((this.l6 & 8L) == 0L) {
            this.a6[super.t2++] = 60;
            this.a6[super.t2++] = 47;
            super.s7(var2);
            this.a6[super.t2++] = 62;
         }
      } else {
         super.k5(var1, var2, var3);
      }

      this.l6 = this.n5.n5() & 0xFF;
   }

   @Override
   public void u3(String var1, String var2, String var3) {
      if (var3.length() == 0) {
         if (super.y4 == this.t2) {
            super.a6[this.t2++] = 32;
         }

         super.s7(var2);
         if ((this.l6 & 7L) != 0L) {
            this.c4 = u3.n5(var2) & 0xFF & this.l6 & 4294967295L;
            if ((this.c4 & 2L) != 0L) {
               super.t4 = true;
               return;
            }
         } else {
            this.c4 = 0L;
         }

         super.a6[this.t2++] = 61;
         super.a6[this.t2++] = 34;
      } else {
         super.u3(var1, var2, var3);
         this.c4 = 0L;
      }

      super.t4 = true;
   }

   @Override
   public void l6() {
      if ((this.c4 & 2L) != 0L) {
         super.y4 = this.t2;
      } else {
         if (this.y2) {
            this.h0();
            this.y2 = false;
         }

         super.a6[this.t2++] = 34;
      }

      super.t4 = false;
      super.y4 = this.t2;
   }

   @Override
   public void n5(String var1, String var2) {
      this.a6[super.t2++] = 60;
      this.a6[super.t2++] = 63;
      super.s7(var1);
      this.a6[super.t2++] = 32;
      super.n5(var2, 63);
      super.a6[super.t2++] = 62;
      if (super.t2 > super.e2) {
         this.ac_();
      }
   }

   @Override
   public void l6(String var1) {
      char[] var2 = com.aspose.slides.ms.System.d1.c8(var1);
      int var3 = var2.length;
      if (super.t4) {
         this.k5(var2, 0, var3);
      } else {
         this.l6(var2, 0, var3);
      }
   }

   @Override
   public void k5(String var1) {
      throw new InvalidOperationException(v3.n5("Operation is not valid due to the current state of the object."));
   }

   @Override
   public void n5(char var1) {
      throw new InvalidOperationException(v3.n5("Operation is not valid due to the current state of the object."));
   }

   @Override
   public void n5(char var1, char var2) {
      throw new InvalidOperationException(v3.n5("Operation is not valid due to the current state of the object."));
   }

   @Override
   public void n5(char[] var1, int var2, int var3) {
      if (this.t4) {
         this.u3(var1, var2, var2 + var3);
      } else {
         this.a6(var1, var2, var2 + var3);
      }
   }

   private void n5(y7 var1) {
      if (k5 == null) {
         u3 = new f5(s3.l6);
         k5 = new f5(s3.n5);
      }

      this.n5 = new c8(10);
      this.y1 = new byte[5];
      this.l6 = 0L;
      this.a0 = var1.q0();
      this.d2 = var1.z1();
   }

   protected final void k5() {
      super.s7("<META http-equiv=\"Content-Type\"");
      if (this.a0 == null) {
         this.a0 = "text/html";
      }

      super.s7(" content=\"");
      super.s7(this.a0);
      super.s7("; charset=");
      super.s7(super.h0.s7());
      super.s7("\">");
   }

   protected final void l6(char[] var1, int var2, int var3) {
      if ((this.l6 & 16L) != 0L) {
         super.u9(var1, var2, var3);
      } else {
         super.a6(var1, var2, var3);
      }
   }

   protected final void k5(char[] var1, int var2, int var3) {
      if ((this.c4 & 7L) != 0L) {
         if ((this.c4 & 2L) != 0L) {
            return;
         }

         if ((this.c4 & 5L) != 0L && !this.d2) {
            this.t2(var1, var2, var3);
         } else {
            this.c8(var1, var2, var3);
         }
      } else if ((this.l6 & 128L) != 0L) {
         super.u3(var1, var2, var3);
      } else {
         this.c8(var1, var2, var3);
      }
   }

   private void c8(char[] var1, int var2, int var3) {
      int var4 = var2;
      if (this.y2) {
         if (var3 - var4 > 0 && var1[var4] != '{') {
            this.h0();
         }

         this.y2 = false;
      }

      byte[] var5 = this.a6;
      byte var6 = 0;
      int var7 = var6 + this.t2;
      char var14 = 0;

      while (true) {
         int var9 = var7 + (var3 - var4);
         if (var9 > var6 + this.e2) {
            var9 = var6 + this.e2;
         }

         while (var7 < var9 && (this.c8.n5[var14 = var1[var4]] & 255 & 128) != 0 && var14 <= 127) {
            var5[var7++] = (byte)var14;
            var4++;
         }

         if (var4 >= var3) {
            this.t2 = var7 - var6;
            return;
         }

         if (var7 >= var9) {
            this.t2 = var7 - var6;
            this.ac_();
            var7 = var6 + 1;
         } else {
            switch (var14) {
               case '\t':
               case '\'':
               case '<':
               case '>':
                  var5[var7++] = (byte)var14;
                  break;
               case '\n':
                  var7 = u9(var5, var7);
                  break;
               case '\r':
                  var7 = h0(var5, var7);
                  break;
               case '"':
                  var7 = u3(var5, var7);
                  break;
               case '&':
                  if (var4 + 1 == var3) {
                     this.y2 = true;
                  } else if (var1[var4 + 1] != '{') {
                     var7 = k5(var5, var7);
                     break;
                  }

                  var5[var7++] = (byte)var14;
                  break;
               default:
                  int[] var10 = new int[]{var4};
                  int[] var11 = new int[]{var7};
                  this.n5(var1, var10, var3, var5, var11);
                  var4 = var10[0];
                  var7 = var11[0];
                  continue;
            }

            var4++;
         }
      }
   }

   private void t2(char[] var1, int var2, int var3) {
      int var4 = var2;
      if (this.y2) {
         if (var3 - var4 > 0 && var1[var4] != '{') {
            this.h0();
         }

         this.y2 = false;
      }

      byte[] var5 = this.a6;
      byte var6 = 0;
      int var7 = var6 + this.t2;
      char var23 = 0;

      label68:
      while (true) {
         int var9 = var7 + (var3 - var4);
         if (var9 > var6 + this.e2) {
            var9 = var6 + this.e2;
         }

         while (var7 < var9 && (this.c8.n5[var23 = var1[var4]] & 255 & 128) != 0 && var23 < 128) {
            var5[var7++] = (byte)var23;
            var4++;
         }

         if (var4 >= var3) {
            this.t2 = var7 - var6;
            return;
         }

         if (var7 >= var9) {
            this.t2 = var7 - var6;
            this.ac_();
            var7 = var6 + 1;
         } else {
            switch (var23) {
               case '\t':
               case '\'':
               case '<':
               case '>':
                  var5[var7++] = (byte)var23;
                  break;
               case '\n':
                  var7 = u9(var5, var7);
                  break;
               case '\r':
                  var7 = h0(var5, var7);
                  break;
               case '"':
                  var7 = u3(var5, var7);
                  break;
               case '&':
                  if (var4 + 1 == var3) {
                     this.y2 = true;
                  } else if (var1[var4 + 1] != '{') {
                     var7 = k5(var5, var7);
                     break;
                  }

                  var5[var7++] = (byte)var23;
                  break;
               default:
                  String var10 = "0123456789ABCDEF";
                  byte[] var11 = this.y1;
                  int var12 = 0;
                  int var13 = var12;
                  int[] var14 = new int[]{var4};
                  int[] var15 = new int[]{0};
                  l6(var1, var14, var3, var11, var15);

                  while (true) {
                     if (var12 >= var13) {
                        continue label68;
                     }

                     var5[var7++] = 37;
                     var5[var7++] = (byte)"0123456789ABCDEF".charAt((var11[var12] & 255) >> 4);
                     var5[var7++] = (byte)"0123456789ABCDEF".charAt(var11[var12] & 255 & 15);
                     var12++;
                  }
            }

            var4++;
         }
      }
   }

   private void h0() {
      super.a6[this.t2++] = 97;
      super.a6[this.t2++] = 109;
      super.a6[this.t2++] = 112;
      super.a6[this.t2++] = 59;
   }
}
