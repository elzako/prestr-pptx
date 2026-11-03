package com.aspose.slides.ms.System.Xml;

import com.aspose.slides.exceptions.ArgumentException;
import com.aspose.slides.exceptions.IndexOutOfRangeException;
import com.aspose.slides.exceptions.XmlException;

public class o6 extends v9 {
   protected byte[] a6;
   protected com.aspose.slides.internal.z0k.t4 u9;
   protected com.aspose.slides.internal.l7h.j5 h0;
   protected u4 c8 = u4.n5().l6();
   protected int t2 = 1;
   protected int s7 = 1;
   protected int x8;
   protected int n3;
   protected int y4;
   protected int e2 = 6144;
   protected boolean t9;
   protected boolean z1;
   protected boolean t4;
   protected int q0;
   protected boolean z3;
   protected boolean m1;
   protected String k7;
   protected boolean m3;
   protected int z8;
   protected int j5;
   protected boolean w1;
   protected boolean r4;

   protected o6(y7 var1) {
      this.q0 = var1.k5();
      this.m1 = var1.l6();
      this.k7 = var1.u3();
      this.m3 = var1.s7();
      this.z3 = var1.c8();
      this.z8 = var1.k7();
      this.j5 = var1.y4();
      this.r4 = var1.t4();
      if (this.m3 && this.q0 == 0) {
         this.n5(this.k7, "NewLineChars", false);
      }
   }

   public o6(com.aspose.slides.internal.z0k.t4 var1, y7 var2) {
      this(var2);
      this.u9 = var1;
      this.h0 = var2.n5();
      this.a6 = new byte[this.e2 + 32];
      if (!var1.canSeek() || var1.getPosition() == 0L) {
         byte[] var3 = this.h0.c8();
         if (var3.length != 0) {
            com.aspose.slides.ms.System.y4.n5(com.aspose.slides.ms.System.u3.n5(var3), 0, com.aspose.slides.ms.System.u3.n5(this.a6), 1, var3.length);
            this.t2 += var3.length;
            this.s7 += var3.length;
         }
      }

      if (var2.m3()) {
         this.n5(this.z8);
         this.w1 = true;
      }
   }

   @Override
   public void n5(int var1) {
      if (!this.m1 && !this.w1) {
         this.s7("<?xml version=\"");
         this.s7("1.0");
         if (this.h0 != null) {
            this.s7("\" encoding=\"");
            this.s7(this.h0.s7());
         }

         if (var1 != 0) {
            this.s7("\" standalone=\"");
            this.s7(var1 == 1 ? "yes" : "no");
         }

         this.s7("\"?>");
      }
   }

   @Override
   public void n5(String var1) {
      if (!this.m1 && !this.w1) {
         this.n5("xml", var1);
      }
   }

   @Override
   public void n5(String var1, String var2, String var3, String var4) {
      this.s7("<!DOCTYPE ");
      this.s7(var1);
      if (var2 != null) {
         this.s7(" PUBLIC \"");
         this.s7(var2);
         this.s7("\" \"");
         if (var3 != null) {
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
      this.a6[this.t2++] = 60;
      if (var1 != null && var1.length() != 0) {
         this.s7(var1);
         this.a6[this.t2++] = 58;
      }

      this.s7(var2);
      this.y4 = this.t2;
   }

   @Override
   public void n5() {
      this.a6[this.t2++] = 62;
      this.x8 = this.t2;
   }

   @Override
   public void l6(String var1, String var2, String var3) {
      if (this.x8 != this.t2) {
         this.a6[this.t2++] = 60;
         this.a6[this.t2++] = 47;
         if (var1 != null && var1.length() != 0) {
            this.s7(var1);
            this.a6[this.t2++] = 58;
         }

         this.s7(var2);
         this.a6[this.t2++] = 62;
      } else {
         this.t2--;
         this.a6[this.t2++] = 32;
         this.a6[this.t2++] = 47;
         this.a6[this.t2++] = 62;
      }
   }

   @Override
   public void k5(String var1, String var2, String var3) {
      this.a6[this.t2++] = 60;
      this.a6[this.t2++] = 47;
      if (var1 != null && var1.length() != 0) {
         this.s7(var1);
         this.a6[this.t2++] = 58;
      }

      this.s7(var2);
      this.a6[this.t2++] = 62;
   }

   @Override
   public void u3(String var1, String var2, String var3) {
      if (this.y4 == this.t2) {
         this.a6[this.t2++] = 32;
      }

      if (var1 != null && var1.length() > 0) {
         this.s7(var1);
         this.a6[this.t2++] = 58;
      }

      this.s7(var2);
      this.a6[this.t2++] = 61;
      this.a6[this.t2++] = 34;
      this.t4 = true;
   }

   @Override
   public void l6() {
      this.a6[this.t2++] = 34;
      this.t4 = false;
      this.y4 = this.t2;
   }

   @Override
   public void l6(String var1, String var2) {
      this.u3(var1);
      this.l6(var2);
      this.u3();
   }

   @Override
   public boolean aa_() {
      return true;
   }

   @Override
   public void u3(String var1) {
      if (var1.length() == 0) {
         this.s7(" xmlns=\"");
      } else {
         this.s7(" xmlns:");
         this.s7(var1);
         this.a6[this.t2++] = 61;
         this.a6[this.t2++] = 34;
      }

      this.t4 = true;
   }

   @Override
   public void u3() {
      this.t4 = false;
      this.a6[this.t2++] = 34;
      this.y4 = this.t2;
   }

   @Override
   public void a6(String var1) {
      if (this.r4 && this.t2 == this.n3) {
         this.t2 -= 3;
      } else {
         this.a6[this.t2++] = 60;
         this.a6[this.t2++] = 33;
         this.a6[this.t2++] = 91;
         this.a6[this.t2++] = 67;
         this.a6[this.t2++] = 68;
         this.a6[this.t2++] = 65;
         this.a6[this.t2++] = 84;
         this.a6[this.t2++] = 65;
         this.a6[this.t2++] = 91;
      }

      this.x8(var1);
      this.a6[this.t2++] = 93;
      this.a6[this.t2++] = 93;
      this.a6[this.t2++] = 62;
      this.s7 = this.t2;
      this.n3 = this.t2;
   }

   @Override
   public void u9(String var1) {
      this.a6[this.t2++] = 60;
      this.a6[this.t2++] = 33;
      this.a6[this.t2++] = 45;
      this.a6[this.t2++] = 45;
      this.n5(var1, 45);
      this.a6[this.t2++] = 45;
      this.a6[this.t2++] = 45;
      this.a6[this.t2++] = 62;
   }

   @Override
   public void n5(String var1, String var2) {
      this.a6[this.t2++] = 60;
      this.a6[this.t2++] = 63;
      this.s7(var1);
      if (var2.length() > 0) {
         this.a6[this.t2++] = 32;
         this.n5(var2, 63);
      }

      this.a6[this.t2++] = 63;
      this.a6[this.t2++] = 62;
   }

   @Override
   public void k5(String var1) {
      this.a6[this.t2++] = 38;
      this.s7(var1);
      this.a6[this.t2++] = 59;
      if (this.t2 > this.e2) {
         this.ac_();
      }

      this.s7 = this.t2;
   }

   @Override
   public void n5(char var1) {
      String var2 = com.aspose.slides.ms.System.a3.n5(var1, "X", com.aspose.slides.internal.x7n.s7.x8());
      if (this.m3 && !this.c8.a6(var1)) {
         throw f4.l6(var1, '\u0000');
      }

      this.a6[this.t2++] = 38;
      this.a6[this.t2++] = 35;
      this.a6[this.t2++] = 120;
      this.s7(var2);
      this.a6[this.t2++] = 59;
      if (this.t2 > this.e2) {
         this.ac_();
      }

      this.s7 = this.t2;
   }

   @Override
   public void h0(String var1) {
      char[] var2 = com.aspose.slides.ms.System.d1.c8(var1);
      int var3 = var2.length;
      if (this.t4) {
         this.u3(var2, 0, var3);
      } else {
         this.a6(var2, 0, var3);
      }
   }

   @Override
   public void l6(String var1) {
      char[] var2 = com.aspose.slides.ms.System.d1.c8(var1);
      int var3 = var2.length;
      if (this.t4) {
         this.u3(var2, 0, var3);
      } else {
         this.a6(var2, 0, var3);
      }
   }

   @Override
   public void n5(char var1, char var2) {
      int var3 = u4.n5(var1, var2);
      this.a6[this.t2++] = 38;
      this.a6[this.t2++] = 35;
      this.a6[this.t2++] = 120;
      this.s7(com.aspose.slides.ms.System.a3.n5(var3, "X", com.aspose.slides.internal.x7n.s7.x8()));
      this.a6[this.t2++] = 59;
      this.s7 = this.t2;
   }

   @Override
   public void n5(char[] var1, int var2, int var3) {
      if (this.t4) {
         this.u3(var1, var2, var2 + var3);
      } else {
         this.a6(var1, var2, var2 + var3);
      }
   }

   @Override
   public void a_(char[] var1, int var2, int var3) {
      this.h0(var1, var2, var2 + var3);
      this.s7 = this.t2;
   }

   @Override
   public void c8(String var1) {
      char[] var2 = com.aspose.slides.ms.System.d1.c8(var1);
      this.h0(var2, 0, var1.length());
      this.s7 = this.t2;
   }

   @Override
   public void a6() {
      try {
         this.ac_();
         this.h0();
      } finally {
         this.t9 = true;
         if (this.u9 != null) {
            try {
               this.u9.flush();
            } finally {
               try {
                  if (this.z3) {
                     this.u9.close();
                  }
               } finally {
                  this.u9 = null;
               }
            }
         }
      }
   }

   @Override
   public void u9() {
      this.ac_();
      this.h0();
      if (this.u9 != null) {
         this.u9.flush();
      }
   }

   protected void ac_() {
      try {
         if (!this.t9) {
            this.u9.write(this.a6, 1, this.t2 - 1);
         }
      } catch (RuntimeException var5) {
         this.t9 = true;
         throw var5;
      } finally {
         this.a6[0] = this.a6[this.t2 - 1];
         if (n5(this.a6[0])) {
            this.a6[1] = this.a6[this.t2];
            this.a6[2] = this.a6[this.t2 + 1];
            this.a6[3] = this.a6[this.t2 + 2];
         }

         this.s7 = this.s7 == this.t2 ? 1 : 0;
         this.y4 = this.y4 == this.t2 ? 1 : 0;
         this.x8 = 0;
         this.n3 = 0;
         this.t2 = 1;
      }
   }

   private void h0() {
   }

   protected final void u3(char[] var1, int var2, int var3) {
      int var4 = var2;
      byte[] var5 = this.a6;
      byte var6 = 0;
      int var7 = var6 + this.t2;
      char var10 = 0;

      while (true) {
         int var9 = var7 + (var3 - var4);
         if (var9 > var6 + this.e2) {
            var9 = var6 + this.e2;
         }

         while (var7 < var9 && (this.c8.n5[var10 = var1[var4]] & 255 & 128) != 0 && var10 <= 127) {
            var5[var7] = (byte)var10;
            var7++;
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
            switch (var10) {
               case '\t':
                  if (this.q0 == 2) {
                     var5[var7] = (byte)var10;
                     var7++;
                  } else {
                     var7 = a6(var5, var7);
                  }
                  break;
               case '\n':
                  if (this.q0 == 2) {
                     var5[var7] = (byte)var10;
                     var7++;
                  } else {
                     var7 = u9(var5, var7);
                  }
                  break;
               case '\r':
                  if (this.q0 == 2) {
                     var5[var7] = (byte)var10;
                     var7++;
                  } else {
                     var7 = h0(var5, var7);
                  }
                  break;
               case '"':
                  var7 = u3(var5, var7);
                  break;
               case '&':
                  var7 = k5(var5, var7);
                  break;
               case '\'':
                  var5[var7] = (byte)var10;
                  var7++;
                  break;
               case '<':
                  var7 = n5(var5, var7);
                  break;
               case '>':
                  var7 = l6(var5, var7);
                  break;
               default:
                  if (u4.k5((int)var10)) {
                     var7 = n5(var1, var4, var3, var5, var7);
                     var4 += 2;
                     continue;
                  }

                  if (var10 > 127 && var10 < '\ufffe') {
                     var7 = n5(var10, var5, var7);
                     var4++;
                     continue;
                  }

                  var7 = this.n5(var10, var5, var7, true);
                  var4++;
                  continue;
            }

            var4++;
         }
      }
   }

   protected final void a6(char[] var1, int var2, int var3) {
      int var4 = var2;
      byte[] var5 = this.a6;
      byte var6 = 0;
      int var7 = var6 + this.t2;
      char var13 = 0;

      while (true) {
         int var9 = var7 + (var3 - var4);
         if (var9 > var6 + this.e2) {
            var9 = var6 + this.e2;
         }

         while (var7 < var9 && (this.c8.n5[var13 = var1[var4]] & 255 & 128) != 0 && var13 <= 127) {
            var5[var7] = (byte)var13;
            var7++;
            var4++;
         }

         if (var4 >= var3) {
            this.t2 = var7 - var6;
            this.s7 = this.t2;
            this.x8 = 0;
            return;
         }

         if (var7 >= var9) {
            this.t2 = var7 - var6;
            this.ac_();
            var7 = var6 + 1;
         } else {
            label68:
            switch (var13) {
               case '\t':
               case '"':
               case '\'':
                  var5[var7] = (byte)var13;
                  var7++;
                  break;
               case '\n':
                  if (this.q0 == 0) {
                     var7 = this.l6(var7);
                  } else {
                     var5[var7] = (byte)var13;
                     var7++;
                  }
                  break;
               case '\r':
                  switch (this.q0) {
                     case 0:
                        try {
                           if (var1[var4 + 1] == '\n') {
                              var4++;
                           }
                        } catch (IndexOutOfRangeException var11) {
                        } catch (ArrayIndexOutOfBoundsException var12) {
                        }

                        var7 = this.l6(var7);
                        break label68;
                     case 1:
                        var7 = h0(var5, var7);
                        break label68;
                     case 2:
                        var5[var7] = (byte)var13;
                        var7++;
                     default:
                        break label68;
                  }
               case '&':
                  var7 = k5(var5, var7);
                  break;
               case '<':
                  var7 = n5(var5, var7);
                  break;
               case '>':
                  var7 = l6(var5, var7);
                  break;
               default:
                  if (u4.k5((int)var13)) {
                     var7 = n5(var1, var4, var3, var5, var7);
                     var4 += 2;
                     continue;
                  }

                  if (var13 > 127 && var13 < '\ufffe') {
                     var7 = n5(var13, var5, var7);
                     var4++;
                     continue;
                  }

                  var7 = this.n5(var13, var5, var7, true);
                  var4++;
                  continue;
            }

            var4++;
         }
      }
   }

   protected final void s7(String var1) {
      char[] var2 = com.aspose.slides.ms.System.d1.c8(var1);
      this.u9(var2, 0, var2.length);
   }

   protected final void u9(char[] var1, int var2, int var3) {
      byte[] var4 = this.a6;
      byte var5 = 0;
      int var6 = var5 + this.t2;
      int var7 = var2;
      char var10 = 0;

      while (true) {
         int var9 = var6 + (var3 - var7);
         if (var9 > var5 + this.e2) {
            var9 = var5 + this.e2;
         }

         while (var6 < var9 && (var10 = var1[var7]) <= 127) {
            var7++;
            var4[var6] = (byte)var10;
            var6++;
         }

         if (var7 >= var3) {
            this.t2 = var6 - var5;
            return;
         }

         if (var6 >= var9) {
            this.t2 = var6 - var5;
            this.ac_();
            var6 = var5 + 1;
         } else if (u4.k5((int)var10)) {
            var6 = n5(var1, var7, var3, var4, var6);
            var7 += 2;
         } else if (var10 > 127 && var10 < '\ufffe') {
            var6 = n5(var10, var4, var6);
            var7++;
         } else {
            var6 = this.n5(var10, var4, var6, false);
            var7++;
         }
      }
   }

   protected final void h0(char[] var1, int var2, int var3) {
      byte[] var4 = this.a6;
      byte var5 = 0;
      int var6 = var5 + this.t2;
      int var7 = var2;
      char var13 = 0;

      while (true) {
         int var9 = var6 + (var3 - var7);
         if (var9 > var5 + this.e2) {
            var9 = var5 + this.e2;
         }

         while (var6 < var9 && (this.c8.n5[var13 = var1[var7]] & 255 & 64) != 0 && var13 <= 127) {
            var4[var6] = (byte)var13;
            var6++;
            var7++;
         }

         if (var7 >= var3) {
            this.t2 = var6 - var5;
            return;
         }

         if (var6 >= var9) {
            this.t2 = var6 - var5;
            this.ac_();
            var6 = var5 + 1;
         } else {
            switch (var13) {
               case '\t':
               case '&':
               case '<':
               case ']':
                  var4[var6] = (byte)var13;
                  var6++;
                  break;
               case '\n':
                  if (this.q0 == 0) {
                     var6 = this.l6(var6);
                  } else {
                     var4[var6] = (byte)var13;
                     var6++;
                  }
                  break;
               case '\r':
                  if (this.q0 == 0) {
                     try {
                        if (var1[var7 + 1] == '\n') {
                           var7++;
                        }
                     } catch (IndexOutOfRangeException var11) {
                     } catch (ArrayIndexOutOfBoundsException var12) {
                     }

                     var6 = this.l6(var6);
                  } else {
                     var4[var6] = (byte)var13;
                     var6++;
                  }
                  break;
               default:
                  if (u4.k5((int)var13)) {
                     var6 = n5(var1, var7, var3, var4, var6);
                     var7 += 2;
                     continue;
                  }

                  if (var13 > 127 && var13 < '\ufffe') {
                     var6 = n5(var13, var4, var6);
                     var7++;
                     continue;
                  }

                  var6 = this.n5(var13, var4, var6, false);
                  var7++;
                  continue;
            }

            var7++;
         }
      }
   }

   protected final void n5(String var1, int var2) {
      if (var1.length() == 0) {
         if (this.t2 >= this.e2) {
            this.ac_();
         }
      } else {
         char[] var3 = com.aspose.slides.ms.System.d1.c8(var1);
         byte var4 = 0;
         int var5 = var4;
         int var6 = var4 + var1.length();
         byte[] var7 = this.a6;
         byte var8 = 0;
         int var9 = var8 + this.t2;
         char var15 = 0;

         while (true) {
            int var11 = var9 + (var6 - var5);
            if (var11 > var8 + this.e2) {
               var11 = var8 + this.e2;
            }

            while (var9 < var11 && (this.c8.n5[var15 = var3[var5]] & 255 & 64) != 0 && var15 != var2 && var15 <= 127) {
               var7[var9] = (byte)var15;
               var9++;
               var5++;
            }

            if (var5 >= var6) {
               this.t2 = var9 - var8;
               return;
            }

            if (var9 >= var11) {
               this.t2 = var9 - var8;
               this.ac_();
               var9 = var8 + 1;
            } else {
               switch (var15) {
                  case '\t':
                  case '&':
                  case '<':
                     var7[var9] = (byte)var15;
                     var9++;
                     break;
                  case '\n':
                     if (this.q0 == 0) {
                        var9 = this.l6(var9);
                     } else {
                        var7[var9] = (byte)var15;
                        var9++;
                     }
                     break;
                  case '\r':
                     if (this.q0 == 0) {
                        try {
                           if (var3[var5 + 1] == '\n') {
                              var5++;
                           }
                        } catch (IndexOutOfRangeException var13) {
                        } catch (ArrayIndexOutOfBoundsException var14) {
                        }

                        var9 = this.l6(var9);
                     } else {
                        var7[var9] = (byte)var15;
                        var9++;
                     }
                     break;
                  case '-':
                     var7[var9] = 45;
                     var9++;
                     if (var15 == var2 && (var5 + 1 == var6 || var3[var5 + 1] == '-')) {
                        var7[var9] = 32;
                        var9++;
                     }
                     break;
                  case '?':
                     var7[var9] = 63;
                     var9++;
                     if (var15 == var2 && var5 + 1 < var6 && var3[var5 + 1] == '>') {
                        var7[var9] = 32;
                        var9++;
                     }
                     break;
                  case ']':
                     var7[var9] = 93;
                     var9++;
                     break;
                  default:
                     if (u4.k5((int)var15)) {
                        var9 = n5(var3, var5, var6, var7, var9);
                        var5 += 2;
                        continue;
                     }

                     if (var15 > 127 && var15 < '\ufffe') {
                        var9 = n5(var15, var7, var9);
                        var5++;
                        continue;
                     }

                     var9 = this.n5(var15, var7, var9, false);
                     var5++;
                     continue;
               }

               var5++;
            }
         }
      }
   }

   protected final void x8(String var1) {
      if (var1.length() == 0) {
         if (this.t2 >= this.e2) {
            this.ac_();
         }
      } else {
         char[] var2 = com.aspose.slides.ms.System.d1.c8(var1);
         byte var3 = 0;
         int var4 = var3;
         int var5 = var3 + var1.length();
         byte[] var6 = this.a6;
         byte var7 = 0;
         int var8 = var7 + this.t2;
         char var15 = 0;

         while (true) {
            int var10 = var8 + (var5 - var4);
            if (var10 > var7 + this.e2) {
               var10 = var7 + this.e2;
            }

            while (var8 < var10 && (this.c8.n5[var15 = var2[var4]] & 255 & 128) != 0 && var15 != ']' && var15 <= 127) {
               var6[var8] = (byte)var15;
               var8++;
               var4++;
            }

            if (var4 >= var5) {
               this.t2 = var8 - var7;
               return;
            }

            if (var8 >= var10) {
               this.t2 = var8 - var7;
               this.ac_();
               var8 = var7 + 1;
            } else {
               switch (var15) {
                  case '\t':
                  case '"':
                  case '&':
                  case '\'':
                  case '<':
                     var6[var8] = (byte)var15;
                     var8++;
                     break;
                  case '\n':
                     if (this.q0 == 0) {
                        var8 = this.l6(var8);
                     } else {
                        var6[var8] = (byte)var15;
                        var8++;
                     }
                     break;
                  case '\r':
                     if (this.q0 == 0) {
                        try {
                           if (var2[var4 + 1] == '\n') {
                              var4++;
                           }
                        } catch (IndexOutOfRangeException var12) {
                        } catch (ArrayIndexOutOfBoundsException var13) {
                        }

                        var8 = this.l6(var8);
                     } else {
                        var6[var8] = (byte)var15;
                        var8++;
                     }
                     break;
                  case '>':
                     if (this.z1 && var6[var8 - 1] == 93) {
                        var8 = t2(var6, var8);
                        var8 = c8(var6, var8);
                     }

                     var6[var8] = 62;
                     var8++;
                     break;
                  case ']':
                     if (var6[var8 - 1] == 93) {
                        this.z1 = true;
                     } else {
                        this.z1 = false;
                     }

                     var6[var8] = 93;
                     var8++;
                     break;
                  default:
                     if (u4.k5((int)var15)) {
                        var8 = n5(var2, var4, var5, var6, var8);
                        var4 += 2;
                        continue;
                     }

                     if (var15 > 127 && var15 < '\ufffe') {
                        var8 = n5(var15, var6, var8);
                        var4++;
                        continue;
                     }

                     var8 = this.n5(var15, var6, var8, false);
                     var4++;
                     continue;
               }

               var4++;
            }
         }
      }
   }

   private static boolean n5(byte var0) {
      return (var0 & 255 & 248) == 240;
   }

   private static int n5(char[] var0, int var1, int var2, byte[] var3, int var4) {
      int var5 = var0[var1];
      if (var5 <= 56319) {
         if (var1 + 1 < var2) {
            char var6 = var0[var1 + 1];
            if (var6 >= '\udc00' && var6 <= '\udfff') {
               var5 = u4.n5(var6, var5);
               var3[var4] = (byte)(240 | var5 >> 18);
               var3[var4 + 1] = (byte)(128 | var5 >> 12 & 63);
               var3[var4 + 2] = (byte)(128 | var5 >> 6 & 63);
               var3[var4 + 3] = (byte)(128 | var5 & 63);
               return var4 + 4;
            } else {
               throw f4.n5((char)var6, (char)var5);
            }
         } else {
            throw new ArgumentException(v3.n5("The surrogate pair is invalid. Missing a low surrogate character."));
         }
      } else {
         throw f4.l6((char)var5);
      }
   }

   private int n5(int var1, byte[] var2, int var3, boolean var4) {
      if (this.m3) {
         throw f4.l6((char)var1, (char)0);
      }

      if (var4) {
         return n5(var2, var3, (char)var1);
      }

      if (var1 < 128) {
         var2[var3] = (byte)var1;
         var3++;
      } else {
         var3 = n5(var1, var2, var3);
      }

      return var3;
   }

   public final void n5(char[] var1, int[] var2, int var3, byte[] var4, int[] var5) {
      char var6 = var1[var2[0]];
      if (u4.k5((int)var6)) {
         var5[0] = n5(var1, var2[0], var3, var4, var5[0]);
         var2[0] += 2;
      } else if (var6 > 127 && var6 < '\ufffe') {
         var5[0] = n5(var6, var4, var5[0]);
         var2[0]++;
      } else {
         var5[0] = this.n5(var6, var4, var5[0], false);
         var2[0]++;
      }
   }

   public static int n5(int var0, byte[] var1, int var2) {
      if (var0 < 2048) {
         var1[var2] = (byte)(-64 | var0 >> 6);
      } else {
         var1[var2] = (byte)(-32 | var0 >> 12);
         var1[++var2] = (byte)(-128 | var0 >> 6 & 63);
      }

      var1[++var2] = (byte)(128 | var0 & 63);
      return var2 + 1;
   }

   public static void l6(char[] var0, int[] var1, int var2, byte[] var3, int[] var4) {
      char var5 = var0[var1[0]];
      if (var5 <= 127) {
         var3[var4[0]] = (byte)var5;
         var4[0]++;
         var1[0]++;
      } else if (u4.k5((int)var5)) {
         var4[0] = n5(var0, var1[0], var2, var3, var4[0]);
         var1[0] += 2;
      } else {
         var4[0] = n5(var5, var3, var4[0]);
         var1[0]++;
      }
   }

   protected final int l6(int var1) {
      byte var2 = 0;
      this.t2 = var1 - var2;
      this.s7(this.k7);
      return var2 + this.t2;
   }

   protected static int n5(byte[] var0, int var1) {
      var0[var1] = 38;
      var0[var1 + 1] = 108;
      var0[var1 + 2] = 116;
      var0[var1 + 3] = 59;
      return var1 + 4;
   }

   protected static int l6(byte[] var0, int var1) {
      var0[var1] = 38;
      var0[var1 + 1] = 103;
      var0[var1 + 2] = 116;
      var0[var1 + 3] = 59;
      return var1 + 4;
   }

   protected static int k5(byte[] var0, int var1) {
      var0[var1] = 38;
      var0[var1 + 1] = 97;
      var0[var1 + 2] = 109;
      var0[var1 + 3] = 112;
      var0[var1 + 4] = 59;
      return var1 + 5;
   }

   protected static int u3(byte[] var0, int var1) {
      var0[var1] = 38;
      var0[var1 + 1] = 113;
      var0[var1 + 2] = 117;
      var0[var1 + 3] = 111;
      var0[var1 + 4] = 116;
      var0[var1 + 5] = 59;
      return var1 + 6;
   }

   protected static int a6(byte[] var0, int var1) {
      var0[var1] = 38;
      var0[var1 + 1] = 35;
      var0[var1 + 2] = 120;
      var0[var1 + 3] = 57;
      var0[var1 + 4] = 59;
      return var1 + 5;
   }

   protected static int u9(byte[] var0, int var1) {
      var0[var1] = 38;
      var0[var1 + 1] = 35;
      var0[var1 + 2] = 120;
      var0[var1 + 3] = 65;
      var0[var1 + 4] = 59;
      return var1 + 5;
   }

   protected static int h0(byte[] var0, int var1) {
      var0[var1] = 38;
      var0[var1 + 1] = 35;
      var0[var1 + 2] = 120;
      var0[var1 + 3] = 68;
      var0[var1 + 4] = 59;
      return var1 + 5;
   }

   private static int n5(byte[] var0, int var1, char var2) {
      String var3 = com.aspose.slides.ms.System.a3.n5(var2, "X", com.aspose.slides.internal.x7n.s7.x8());
      var0[var1] = 38;
      var0[var1 + 1] = 35;
      var0[var1 + 2] = 120;
      var1 += 3;
      char[] var4 = com.aspose.slides.ms.System.d1.c8(var3);
      int var5 = 0;

      try {
         while (var0[var1++] == (byte)var4[var5++]) {
         }
      } catch (IndexOutOfRangeException var7) {
      } catch (ArrayIndexOutOfBoundsException var8) {
      }

      var0[var1 - 1] = 59;
      return var1;
   }

   protected static int c8(byte[] var0, int var1) {
      var0[var1] = 60;
      var0[var1 + 1] = 33;
      var0[var1 + 2] = 91;
      var0[var1 + 3] = 67;
      var0[var1 + 4] = 68;
      var0[var1 + 5] = 65;
      var0[var1 + 6] = 84;
      var0[var1 + 7] = 65;
      var0[var1 + 8] = 91;
      return var1 + 9;
   }

   protected static int t2(byte[] var0, int var1) {
      var0[var1] = 93;
      var0[var1 + 1] = 93;
      var0[var1 + 2] = 62;
      return var1 + 3;
   }

   protected final void n5(String var1, String var2, boolean var3) {
      if (var3) {
         if (!this.c8.n5(var1)) {
            throw new ArgumentException(
               v3.n5(
                  "XmlWriterSettings.{0} can contain only valid XML white space characters when XmlWriterSettings.CheckCharacters and XmlWriterSettings.NewLineOnAttributes are true.",
                  var2
               )
            );
         }
      } else {
         String var4 = null;

         for (int var5 = 0; var5 < var1.length(); var5++) {
            if (!this.c8.h0(var1.charAt(var5))) {
               switch (var1.charAt(var5)) {
                  case '\t':
                  case '\n':
                  case '\r':
                     break;
                  case '&':
                  case '<':
                  case ']':
                     var4 = v3.n5("'{0}', hexadecimal value {1}, is an invalid character.", XmlException.buildCharExceptionArgs(var1, var5));
                     throw new ArgumentException(
                        v3.n5(
                           "XmlWriterSettings.{0} can contain only valid XML text content characters when XmlWriterSettings.CheckCharacters is true. {1}",
                           var2,
                           var4
                        )
                     );
                  default:
                     if (u4.n5((int)var1.charAt(var5))) {
                        if (var5 + 1 >= var1.length() || !u4.l6((int)var1.charAt(var5 + 1))) {
                           var4 = v3.n5("The surrogate pair is invalid. Missing a low surrogate character.");
                           throw new ArgumentException(
                              v3.n5(
                                 "XmlWriterSettings.{0} can contain only valid XML text content characters when XmlWriterSettings.CheckCharacters is true. {1}",
                                 var2,
                                 var4
                              )
                           );
                        }

                        var5++;
                     } else if (u4.l6((int)var1.charAt(var5))) {
                        var4 = v3.n5(
                           "Invalid high surrogate character (0x{0}). A high surrogate character must have a value from range (0xD800 - 0xDBFF).",
                           com.aspose.slides.ms.System.l4.n5(var1.charAt(var5), "X", com.aspose.slides.internal.x7n.l6.k5())
                        );
                        throw new ArgumentException(
                           v3.n5(
                              "XmlWriterSettings.{0} can contain only valid XML text content characters when XmlWriterSettings.CheckCharacters is true. {1}",
                              var2,
                              var4
                           )
                        );
                     }
               }
            }
         }
      }
   }
}
