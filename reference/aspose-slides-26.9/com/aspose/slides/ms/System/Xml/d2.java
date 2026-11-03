package com.aspose.slides.ms.System.Xml;

import com.aspose.slides.exceptions.InvalidOperationException;

public class d2 extends n9 {
   protected c8 n5;
   protected long l6;
   private long s3;
   private boolean i1;
   private byte[] e5;
   private String b3;
   private boolean o0;
   protected static f5 k5;
   protected static f5 u3;

   public d2(com.aspose.slides.internal.z0k.a0 var1, y7 var2) {
      super(var1, var2);
      this.n5(var2);
   }

   public d2(com.aspose.slides.internal.z0k.t4 var1, y7 var2) {
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
      if (this.m3 && this.z8) {
         this.n5(false);
      }

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

         this.z3[this.t2++] = '"';
      } else if (var3 != null) {
         this.s7(" SYSTEM \"");
         this.s7(var3);
         this.z3[this.t2++] = '"';
      } else {
         this.z3[this.t2++] = ' ';
      }

      if (var4 != null) {
         this.z3[this.t2++] = '[';
         this.s7(var4);
         this.z3[this.t2++] = ']';
      }

      this.z3[this.t2++] = '>';
   }

   @Override
   public void n5(String var1, String var2, String var3) {
      this.n5.n5((byte)this.l6);
      if (var3.length() == 0) {
         if (this.m3 && this.z8) {
            this.n5(false);
         }

         this.l6 = k5.n5(var2) & 0xFF;
         super.z3[this.t2++] = '<';
         super.s7(var2);
         super.y4 = this.t2;
      } else {
         this.l6 = 128L;
         super.n5(var1, var2, var3);
      }
   }

   @Override
   public void n5() {
      super.z3[super.t2++] = '>';
      this.x8 = this.t2;
      if ((this.l6 & 32L) != 0L) {
         this.k5();
      }
   }

   @Override
   public void l6(String var1, String var2, String var3) {
      if (var3.length() == 0) {
         if (this.m3 && this.z8) {
            this.n5(false);
         }

         if ((this.l6 & 8L) == 0L) {
            this.z3[super.t2++] = '<';
            this.z3[super.t2++] = '/';
            super.s7(var2);
            this.z3[super.t2++] = '>';
         }
      } else {
         super.l6(var1, var2, var3);
      }

      this.l6 = this.n5.n5() & 0xFF;
   }

   @Override
   public void k5(String var1, String var2, String var3) {
      if (var3.length() == 0) {
         if (this.m3 && this.z8) {
            this.n5(false);
         }

         if ((this.l6 & 8L) == 0L) {
            this.z3[super.t2++] = '<';
            this.z3[super.t2++] = '/';
            super.s7(var2);
            this.z3[super.t2++] = '>';
         }
      } else {
         super.k5(var1, var2, var3);
      }

      this.l6 = this.n5.n5() & 0xFF;
   }

   @Override
   public void u3(String var1, String var2, String var3) {
      if (var3.length() == 0) {
         if (this.m3 && this.z8) {
            this.n5(false);
         }

         if (super.y4 == this.t2) {
            super.z3[this.t2++] = ' ';
         }

         super.s7(var2);
         if ((this.l6 & 7L) != 0L) {
            this.s3 = u3.n5(var2) & 0xFF & this.l6 & 4294967295L;
            if ((this.s3 & 2L) != 0L) {
               super.t4 = true;
               return;
            }
         } else {
            this.s3 = 0L;
         }

         super.z3[this.t2++] = '=';
         super.z3[this.t2++] = '"';
      } else {
         super.u3(var1, var2, var3);
         this.s3 = 0L;
      }

      super.t4 = true;
   }

   @Override
   public void l6() {
      if ((this.s3 & 2L) != 0L) {
         super.y4 = this.t2;
      } else {
         if (this.i1) {
            this.h0();
            this.i1 = false;
         }

         if (this.m3 && this.z8) {
            this.n5(false);
         }

         super.z3[this.t2++] = '"';
      }

      super.t4 = false;
      super.y4 = this.t2;
   }

   @Override
   public void n5(String var1, String var2) {
      if (this.m3 && this.z8) {
         this.n5(false);
      }

      this.z3[super.t2++] = '<';
      this.z3[super.t2++] = '?';
      super.s7(var1);
      this.z3[super.t2++] = ' ';
      super.n5(var2, 63);
      super.z3[super.t2++] = '>';
      if (super.t2 > super.e2) {
         this.ab_();
      }
   }

   @Override
   public void l6(String var1) {
      if (this.m3 && !this.z8) {
         this.n5(true);
      }

      char[] var2 = com.aspose.slides.ms.System.d1.c8(var1);
      int var3 = var1.length();
      if (super.t4) {
         this.l6(var2, var3);
      } else {
         this.n5(var2, var3);
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
      if (this.m3 && !this.z8) {
         this.n5(true);
      }

      if (this.t4) {
         this.k5(var1, var2, var2 + var3);
      } else {
         this.u3(var1, var2, var2 + var3);
      }
   }

   private void n5(y7 var1) {
      if (k5 == null) {
         u3 = new f5(com.aspose.slides.ms.System.Xml.s3.l6);
         k5 = new f5(com.aspose.slides.ms.System.Xml.s3.n5);
      }

      this.n5 = new c8(10);
      this.e5 = new byte[5];
      this.l6 = 0L;
      this.b3 = var1.q0();
      this.o0 = var1.z1();
   }

   protected final void k5() {
      super.s7("<META http-equiv=\"Content-Type\"");
      if (this.b3 == null) {
         this.b3 = "text/html";
      }

      super.s7(" content=\"");
      super.s7(this.b3);
      super.s7("; charset=");
      super.s7(super.h0.s7());
      super.s7("\">");
   }

   protected final void n5(char[] var1, int var2) {
      if ((this.l6 & 16L) != 0L) {
         super.a6(var1, 0, var2);
      } else {
         super.u3(var1, 0, var2);
      }
   }

   protected final void l6(char[] var1, int var2) {
      if ((this.s3 & 7L) != 0L) {
         if ((this.s3 & 2L) != 0L) {
            return;
         }

         if ((this.s3 & 5L) != 0L && !this.o0) {
            this.y4(var1, var2);
         } else {
            this.n3(var1, var2);
         }
      } else if ((this.l6 & 128L) != 0L) {
         super.k5(var1, 0, var2);
      } else {
         this.n3(var1, var2);
      }
   }

   private void n3(char[] var1, int var2) {
      int var3 = 0;
      if (this.i1) {
         if (var2 - var3 > 0 && var1[var3] != '{') {
            this.h0();
         }

         this.i1 = false;
      }

      char[] var4 = this.z3;
      byte var5 = 0;
      int var6 = var5 + this.t2;
      char var13 = 0;

      while (true) {
         int var8 = var6 + (var2 - var3);
         if (var8 > var5 + this.e2) {
            var8 = var5 + this.e2;
         }

         while (var6 < var8 && (this.c8.n5[var13 = var1[var3]] & 255 & 128) != 0) {
            var4[var6++] = var13;
            var3++;
         }

         if (var3 >= var2) {
            this.t2 = var6 - var5;
            return;
         }

         if (var6 >= var8) {
            this.t2 = var6 - var5;
            this.ab_();
            var6 = var5 + 1;
         } else {
            switch (var13) {
               case '\t':
               case '\'':
               case '<':
               case '>':
                  var4[var6++] = var13;
                  break;
               case '\n':
                  var6 = c8(var4, var6);
                  break;
               case '\r':
                  var6 = t2(var4, var6);
                  break;
               case '"':
                  var6 = u9(var4, var6);
                  break;
               case '&':
                  if (var3 + 1 == var2) {
                     this.i1 = true;
                  } else if (var1[var3 + 1] != '{') {
                     var6 = a6(var4, var6);
                     break;
                  }

                  var4[var6++] = var13;
                  break;
               default:
                  int[] var9 = new int[]{var3};
                  int[] var10 = new int[]{var6};
                  this.n5(var1, var9, var2, var4, var10);
                  var3 = var9[0];
                  var6 = var10[0];
                  continue;
            }

            var3++;
         }
      }
   }

   private void y4(char[] var1, int var2) {
      int var3 = 0;
      if (this.i1) {
         if (var2 - var3 > 0 && var1[var3] != '{') {
            this.h0();
         }

         this.i1 = false;
      }

      char[] var4 = this.z3;
      byte var5 = 0;
      int var6 = var5 + this.t2;
      char var23 = 0;

      label68:
      while (true) {
         int var8 = var6 + (var2 - var3);
         if (var8 > var5 + this.e2) {
            var8 = var5 + this.e2;
         }

         while (var6 < var8 && (this.c8.n5[var23 = var1[var3]] & 255 & 128) != 0 && var23 < 128) {
            var4[var6++] = var23;
            var3++;
         }

         if (var3 >= var2) {
            this.t2 = var6 - var5;
            return;
         }

         if (var6 >= var8) {
            this.t2 = var6 - var5;
            this.ab_();
            var6 = var5 + 1;
         } else {
            switch (var23) {
               case '\t':
               case '\'':
               case '<':
               case '>':
                  var4[var6++] = var23;
                  break;
               case '\n':
                  var6 = c8(var4, var6);
                  break;
               case '\r':
                  var6 = t2(var4, var6);
                  break;
               case '"':
                  var6 = u9(var4, var6);
                  break;
               case '&':
                  if (var3 + 1 == var2) {
                     this.i1 = true;
                  } else if (var1[var3 + 1] != '{') {
                     var6 = a6(var4, var6);
                     break;
                  }

                  var4[var6++] = var23;
                  break;
               default:
                  String var9 = "0123456789ABCDEF";
                  byte[] var10 = this.e5;
                  int var11 = 0;
                  byte var12 = (byte)var11;
                  int[] var13 = new int[]{var3};
                  int[] var14 = new int[]{0};
                  o6.l6(var1, var13, var2, var10, var14);
                  var3 = var13[0];
                  var11 = var14[0];

                  while (true) {
                     if (var11 >= var12) {
                        continue label68;
                     }

                     var4[var6++] = '%';
                     var4[var6++] = "0123456789ABCDEF".charAt((var10[var11] & 255) >> 4);
                     var4[var6++] = "0123456789ABCDEF".charAt(var10[var11] & 255 & 15);
                     var11++;
                  }
            }

            var3++;
         }
      }
   }

   private void h0() {
      super.z3[this.t2++] = 'a';
      super.z3[this.t2++] = 'm';
      super.z3[this.t2++] = 'p';
      super.z3[this.t2++] = ';';
   }
}
