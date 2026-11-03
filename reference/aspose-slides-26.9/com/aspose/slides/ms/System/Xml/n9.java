package com.aspose.slides.ms.System.Xml;

import com.aspose.slides.exceptions.ArgumentException;
import com.aspose.slides.exceptions.IndexOutOfRangeException;
import com.aspose.slides.exceptions.XmlException;

public class n9 extends v9 {
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
   protected char[] z3;
   protected com.aspose.slides.internal.l7h.t9 m1;
   protected com.aspose.slides.internal.z0k.a0 k7;
   protected boolean m3;
   protected boolean z8;
   private int n5;
   private int[] l6;
   private s7 k5;
   protected int j5;
   protected boolean w1;
   protected boolean r4;
   protected String c4;
   protected boolean y2;
   protected int y1;
   protected int a0;
   protected boolean d2;
   protected boolean d5;

   protected n9(y7 var1) {
      this.j5 = var1.k5();
      this.r4 = var1.l6();
      this.c4 = var1.u3();
      this.y2 = var1.s7();
      this.w1 = var1.c8();
      this.y1 = var1.k7();
      this.a0 = var1.y4();
      this.d5 = var1.t4();
      if (this.y2 && this.j5 == 0) {
         this.n5(this.c4, "NewLineChars", false);
      }
   }

   public n9(com.aspose.slides.internal.z0k.a0 var1, y7 var2) {
      this(var2);
      this.k7 = var1;
      this.h0 = var1.l6();
      this.z3 = new char[this.e2 + 32];
      if (var2.m3()) {
         this.n5(this.y1);
         this.d2 = true;
      }
   }

   public n9(com.aspose.slides.internal.z0k.t4 var1, y7 var2) {
      this(var2);
      this.u9 = var1;
      this.h0 = var2.n5();
      this.z3 = new char[this.e2 + 32];
      this.a6 = new byte[this.z3.length];
      this.q0 = 0;
      this.m3 = true;
      this.z8 = false;
      this.n5 = 0;
      this.l6 = new int[64];
      this.l6[0] = 1;
      this.k5 = new s7();
      this.h0 = (com.aspose.slides.internal.l7h.j5)var2.n5().deepClone();
      this.h0.n5(this.k5);
      this.m1 = this.h0.k5();
      if (!var1.canSeek() || var1.getPosition() == 0L) {
         byte[] var3 = this.h0.c8();
         if (var3.length != 0) {
            this.u9.write(var3, 0, var3.length);
         }
      }

      if (var2.m3()) {
         this.n5(this.y1);
         this.d2 = true;
      }
   }

   @Override
   public void n5(int var1) {
      if (!this.r4 && !this.d2) {
         if (this.m3 && this.z8) {
            this.n5(false);
         }

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
      if (!this.r4 && !this.d2) {
         this.n5("xml", var1);
      }
   }

   @Override
   public void n5(String var1, String var2, String var3, String var4) {
      if (this.m3 && this.z8) {
         this.n5(false);
      }

      this.s7("<!DOCTYPE ");
      this.s7(var1);
      if (var2 != null) {
         this.s7(" PUBLIC \"");
         this.s7(var2);
         this.s7("\" \"");
         if (var3 != null) {
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
      if (this.m3 && this.z8) {
         this.n5(false);
      }

      this.z3[this.t2++] = '<';
      if (var1 != null && var1.length() != 0) {
         this.s7(var1);
         this.z3[this.t2++] = ':';
      }

      this.s7(var2);
      this.y4 = this.t2;
   }

   @Override
   public void n5() {
      this.z3[this.t2++] = '>';
      this.x8 = this.t2;
   }

   @Override
   public void l6(String var1, String var2, String var3) {
      if (this.m3 && this.z8) {
         this.n5(false);
      }

      if (this.x8 != this.t2) {
         this.z3[this.t2++] = '<';
         this.z3[this.t2++] = '/';
         if (var1 != null && var1.length() != 0) {
            this.s7(var1);
            this.z3[this.t2++] = ':';
         }

         this.s7(var2);
         this.z3[this.t2++] = '>';
      } else {
         this.t2--;
         this.z3[this.t2++] = ' ';
         this.z3[this.t2++] = '/';
         this.z3[this.t2++] = '>';
      }
   }

   @Override
   public void k5(String var1, String var2, String var3) {
      if (this.m3 && this.z8) {
         this.n5(false);
      }

      this.z3[this.t2++] = '<';
      this.z3[this.t2++] = '/';
      if (var1 != null && var1.length() != 0) {
         this.s7(var1);
         this.z3[this.t2++] = ':';
      }

      this.s7(var2);
      this.z3[this.t2++] = '>';
   }

   @Override
   public void u3(String var1, String var2, String var3) {
      if (this.m3 && this.z8) {
         this.n5(false);
      }

      if (this.y4 == this.t2) {
         this.z3[this.t2++] = ' ';
      }

      if (var1 != null && var1.length() > 0) {
         this.s7(var1);
         this.z3[this.t2++] = ':';
      }

      this.s7(var2);
      this.z3[this.t2++] = '=';
      this.z3[this.t2++] = '"';
      this.t4 = true;
   }

   @Override
   public void l6() {
      if (this.m3 && this.z8) {
         this.n5(false);
      }

      this.z3[this.t2++] = '"';
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
      if (this.m3 && this.z8) {
         this.n5(false);
      }

      if (var1.length() == 0) {
         this.s7(" xmlns=\"");
      } else {
         this.s7(" xmlns:");
         this.s7(var1);
         this.z3[this.t2++] = '=';
         this.z3[this.t2++] = '"';
      }

      this.t4 = true;
      if (this.m3 && !this.z8) {
         this.n5(true);
      }
   }

   @Override
   public void u3() {
      if (this.m3 && this.z8) {
         this.n5(false);
      }

      this.t4 = false;
      this.z3[this.t2++] = '"';
      this.y4 = this.t2;
   }

   @Override
   public void a6(String var1) {
      if (this.m3 && this.z8) {
         this.n5(false);
      }

      if (this.d5 && this.t2 == this.n3) {
         this.t2 -= 3;
      } else {
         this.z3[this.t2++] = '<';
         this.z3[this.t2++] = '!';
         this.z3[this.t2++] = '[';
         this.z3[this.t2++] = 'C';
         this.z3[this.t2++] = 'D';
         this.z3[this.t2++] = 'A';
         this.z3[this.t2++] = 'T';
         this.z3[this.t2++] = 'A';
         this.z3[this.t2++] = '[';
      }

      this.x8(var1);
      this.z3[this.t2++] = ']';
      this.z3[this.t2++] = ']';
      this.z3[this.t2++] = '>';
      this.s7 = this.t2;
      this.n3 = this.t2;
   }

   @Override
   public void u9(String var1) {
      if (this.m3 && this.z8) {
         this.n5(false);
      }

      this.z3[this.t2++] = '<';
      this.z3[this.t2++] = '!';
      this.z3[this.t2++] = '-';
      this.z3[this.t2++] = '-';
      this.n5(var1, 45);
      this.z3[this.t2++] = '-';
      this.z3[this.t2++] = '-';
      this.z3[this.t2++] = '>';
   }

   @Override
   public void n5(String var1, String var2) {
      if (this.m3 && this.z8) {
         this.n5(false);
      }

      this.z3[this.t2++] = '<';
      this.z3[this.t2++] = '?';
      this.s7(var1);
      if (var2.length() > 0) {
         this.z3[this.t2++] = ' ';
         this.n5(var2, 63);
      }

      this.z3[this.t2++] = '?';
      this.z3[this.t2++] = '>';
   }

   @Override
   public void k5(String var1) {
      if (this.m3 && this.z8) {
         this.n5(false);
      }

      this.z3[this.t2++] = '&';
      this.s7(var1);
      this.z3[this.t2++] = ';';
      if (this.t2 > this.e2) {
         this.ab_();
      }

      this.s7 = this.t2;
   }

   @Override
   public void n5(char var1) {
      String var2 = com.aspose.slides.ms.System.a3.n5(var1, "X", com.aspose.slides.internal.x7n.s7.x8());
      if (this.y2 && !this.c8.a6(var1)) {
         throw f4.l6(var1, '\u0000');
      }

      if (this.m3 && this.z8) {
         this.n5(false);
      }

      this.z3[this.t2++] = '&';
      this.z3[this.t2++] = '#';
      this.z3[this.t2++] = 'x';
      this.s7(var2);
      this.z3[this.t2++] = ';';
      if (this.t2 > this.e2) {
         this.ab_();
      }

      this.s7 = this.t2;
   }

   @Override
   public void h0(String var1) {
      if (this.m3 && this.z8) {
         this.n5(false);
      }

      char[] var2 = com.aspose.slides.ms.System.d1.c8(var1);
      int var3 = var1.length();
      if (this.t4) {
         this.k5(var2, 0, var3);
      } else {
         this.u3(var2, 0, var3);
      }
   }

   @Override
   public void l6(String var1) {
      if (this.m3 && !this.z8) {
         this.n5(true);
      }

      char[] var2 = com.aspose.slides.ms.System.d1.c8(var1);
      int var3 = var2.length;
      if (this.t4) {
         this.k5(var2, 0, var3);
      } else {
         this.u3(var2, 0, var3);
      }
   }

   @Override
   public void n5(char var1, char var2) {
      if (this.m3 && this.z8) {
         this.n5(false);
      }

      int var3 = u4.n5(var1, var2);
      this.z3[this.t2++] = '&';
      this.z3[this.t2++] = '#';
      this.z3[this.t2++] = 'x';
      this.s7(com.aspose.slides.ms.System.a3.n5(var3, "X", com.aspose.slides.internal.x7n.s7.x8()));
      this.z3[this.t2++] = ';';
      this.s7 = this.t2;
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

   @Override
   public void a_(char[] var1, int var2, int var3) {
      if (this.m3 && this.z8) {
         this.n5(false);
      }

      this.u9(var1, var2, var2 + var3);
      this.s7 = this.t2;
   }

   @Override
   public void c8(String var1) {
      if (this.m3 && this.z8) {
         this.n5(false);
      }

      char[] var2 = com.aspose.slides.ms.System.d1.c8(var1);
      int var3 = var2.length;
      this.u9(var2, 0, var3);
      this.s7 = this.t2;
   }

   @Override
   public void a6() {
      try {
         this.ab_();
         this.h0();
      } finally {
         this.t9 = true;
         if (this.u9 != null) {
            try {
               this.u9.flush();
            } finally {
               try {
                  if (this.w1) {
                     this.u9.close();
                  }
               } finally {
                  this.u9 = null;
               }
            }
         } else if (this.k7 != null) {
            try {
               this.k7.k5();
            } finally {
               try {
                  if (this.w1) {
                     this.k7.u3();
                  }
               } finally {
                  this.k7 = null;
               }
            }
         }
      }
   }

   @Override
   public void u9() {
      this.ab_();
      this.h0();
      if (this.u9 != null) {
         this.u9.flush();
      } else if (this.k7 != null) {
         this.k7.k5();
      }
   }

   protected void ab_() {
      try {
         if (!this.t9) {
            if (this.u9 != null) {
               if (this.m3) {
                  this.k5.n5(this.l6, this.n5);
                  if ((this.n5 & 1) != 0) {
                     this.l6[1] = 1;
                     this.n5 = 1;
                  } else {
                     this.n5 = 0;
                  }
               }

               this.n5(1, this.t2, true);
            } else {
               this.k7.n5(this.z3, 1, this.t2 - 1);
            }
         }
      } catch (RuntimeException var5) {
         this.t9 = true;
         throw var5;
      } finally {
         this.z3[0] = this.z3[this.t2 - 1];
         this.s7 = this.s7 == this.t2 ? 1 : 0;
         this.y4 = this.y4 == this.t2 ? 1 : 0;
         this.x8 = 0;
         this.n3 = 0;
         this.t2 = 1;
      }
   }

   private void n5(int var1, int var2, boolean var3) {
      int var4 = 0;
      int var5 = 0;
      boolean var6 = false;

      while (var1 < var2) {
         if (this.k5 != null) {
            this.k5.n5(var1);
         }

         int[] var7 = new int[]{var4};
         int[] var8 = new int[]{var5};
         boolean[] var9 = new boolean[]{var6};
         this.m1.n5(this.z3, var1, var2 - var1, this.a6, this.q0, this.a6.length - this.q0, false, var7, var8, var9);
         var4 = var7[0];
         var5 = var8[0];
         var6 = var9[0];
         var1 += var4;
         this.q0 += var5;
         if (this.q0 >= this.a6.length - 16) {
            this.u9.write(this.a6, 0, this.q0);
            this.q0 = 0;
         }
      }

      if (var3 && this.q0 > 0) {
         this.u9.write(this.a6, 0, this.q0);
         this.q0 = 0;
      }
   }

   private void h0() {
      if (this.u9 != null) {
         int var1 = 0;
         int var2 = 0;
         boolean var3 = false;
         int[] var4 = new int[]{0};
         int[] var5 = new int[]{0};
         boolean[] var6 = new boolean[]{false};
         this.m1.n5(this.z3, 1, 0, this.a6, 0, this.a6.length, true, var4, var5, var6);
         var1 = var4[0];
         var2 = var5[0];
         var3 = var6[0];
         if (var2 != 0) {
            this.u9.write(this.a6, 0, var2);
         }
      }
   }

   protected final void k5(char[] var1, int var2, int var3) {
      int var4 = var2;
      char[] var5 = this.z3;
      byte var6 = 0;
      int var7 = this.t2;
      char var10 = 0;

      while (true) {
         int var9 = var7 + (var3 - var4);
         if (var9 > var6 + this.e2) {
            var9 = var6 + this.e2;
         }

         while (var7 < var9 && (this.c8.n5[var10 = var1[var4]] & 255 & 128) != 0) {
            var5[var7] = (char)var10;
            var7++;
            var4++;
         }

         if (var4 >= var3) {
            this.t2 = var7 - var6;
            return;
         }

         if (var4 >= var9) {
            this.t2 = var4 - var6;
            this.ab_();
            var4 = var6 + 1;
         } else {
            switch (var10) {
               case '\t':
                  if (this.j5 == 2) {
                     var5[var7] = (char)var10;
                     var7++;
                  } else {
                     var7 = h0(var5, var7);
                  }
                  break;
               case '\n':
                  if (this.j5 == 2) {
                     var5[var7] = (char)var10;
                     var7++;
                  } else {
                     var7 = c8(var5, var7);
                  }
                  break;
               case '\r':
                  if (this.j5 == 2) {
                     var5[var7] = (char)var10;
                     var7++;
                  } else {
                     var7 = t2(var5, var7);
                  }
                  break;
               case '"':
                  var7 = u9(var5, var7);
                  break;
               case '&':
                  var7 = a6(var5, var7);
                  break;
               case '\'':
                  var5[var7] = (char)var10;
                  var7++;
                  break;
               case '<':
                  var7 = k5(var5, var7);
                  break;
               case '>':
                  var7 = u3(var5, var7);
                  break;
               default:
                  if (u4.k5((int)var10)) {
                     var7 = n5(var1, var4, var3, var5, var7);
                     var4 += 2;
                     continue;
                  }

                  if (var10 > 127 && var10 < '\ufffe') {
                     var5[var7] = (char)var10;
                     var7++;
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

   protected final void u3(char[] var1, int var2, int var3) {
      int var4 = var2;
      char[] var5 = this.z3;
      byte var6 = 0;
      int var7 = var6 + this.t2;
      char var13 = 0;

      while (true) {
         int var9 = var7 + (var3 - var4);
         if (var9 > var6 + this.e2) {
            var9 = var6 + this.e2;
         }

         while (var7 < var9 && (this.c8.n5[var13 = var1[var4]] & 255 & 128) != 0) {
            var5[var7] = (char)var13;
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
            this.ab_();
            var7 = var6 + 1;
         } else {
            label65:
            switch (var13) {
               case '\t':
               case '"':
               case '\'':
                  var5[var7] = (char)var13;
                  var7++;
                  break;
               case '\n':
                  if (this.j5 == 0) {
                     var7 = this.l6(var7);
                  } else {
                     var5[var7] = (char)var13;
                     var7++;
                  }
                  break;
               case '\r':
                  switch (this.j5) {
                     case 0:
                        try {
                           if (var1[var4 + 1] == '\n') {
                              var4++;
                           }
                        } catch (IndexOutOfRangeException var11) {
                        } catch (ArrayIndexOutOfBoundsException var12) {
                        }

                        var7 = this.l6(var7);
                        break label65;
                     case 1:
                        var7 = t2(var5, var7);
                        break label65;
                     case 2:
                        var5[var7] = (char)var13;
                        var7++;
                     default:
                        break label65;
                  }
               case '&':
                  var7 = a6(var5, var7);
                  break;
               case '<':
                  var7 = k5(var5, var7);
                  break;
               case '>':
                  var7 = u3(var5, var7);
                  break;
               default:
                  if (u4.k5((int)var13)) {
                     var7 = n5(var1, var4, var3, var5, var7);
                     var4 += 2;
                     continue;
                  }

                  if (var13 > 127 && var13 < '\ufffe') {
                     var5[var7] = (char)var13;
                     var7++;
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
      this.a6(var2, 0, var2.length);
   }

   protected final void a6(char[] var1, int var2, int var3) {
      char[] var4 = this.z3;
      byte var5 = 0;
      int var6 = var5 + this.t2;
      int var7 = var2;
      char var10 = 0;

      while (true) {
         int var9 = var6 + (var3 - var7);
         if (var9 > var5 + this.e2) {
            var9 = var5 + this.e2;
         }

         while (var6 < var9 && (var10 = var1[var7]) < '\ud800') {
            var7++;
            var4[var6] = (char)var10;
            var6++;
         }

         if (var7 >= var3) {
            this.t2 = var6 - var5;
            return;
         }

         if (var6 >= var9) {
            this.t2 = var6 - var5;
            this.ab_();
            var6 = var5 + 1;
         } else if (u4.k5((int)var10)) {
            var6 = n5(var1, var7, var3, var4, var6);
            var7 += 2;
         } else if (var10 > 127 && var10 < '\ufffe') {
            var4[var6] = (char)var10;
            var6++;
            var7++;
         } else {
            var6 = this.n5(var10, var4, var6, false);
            var7++;
         }
      }
   }

   protected final void u9(char[] var1, int var2, int var3) {
      char[] var4 = this.z3;
      int var5 = var2;
      byte var6 = 0;
      int var7 = var6 + this.t2;
      char var13 = 0;

      while (true) {
         int var9 = var7 + (var3 - var5);
         if (var9 > var6 + this.e2) {
            var9 = var6 + this.e2;
         }

         while (var7 < var9 && (this.c8.n5[var13 = var1[var5]] & 255 & 64) != 0) {
            var4[var7] = (char)var13;
            var7++;
            var5++;
         }

         if (var5 >= var3) {
            this.t2 = var7 - var6;
            return;
         }

         if (var7 >= var9) {
            this.t2 = var7 - var6;
            this.ab_();
            var7 = var6 + 1;
         } else {
            switch (var13) {
               case '\t':
               case '&':
               case '<':
               case ']':
                  var4[var7] = (char)var13;
                  var7++;
                  break;
               case '\n':
                  if (this.j5 == 0) {
                     var7 = this.l6(var7);
                  } else {
                     var4[var7] = (char)var13;
                     var7++;
                  }
                  break;
               case '\r':
                  if (this.j5 == 0) {
                     try {
                        if (var1[var5 + 1] == '\n') {
                           var5++;
                        }
                     } catch (IndexOutOfRangeException var11) {
                     } catch (ArrayIndexOutOfBoundsException var12) {
                     }

                     var7 = this.l6(var7);
                  } else {
                     var4[var7] = (char)var13;
                     var7++;
                  }
                  break;
               default:
                  if (u4.k5((int)var13)) {
                     var7 = n5(var1, var5, var3, var4, var7);
                     var5 += 2;
                     continue;
                  }

                  if (var13 > 127 && var13 < '\ufffe') {
                     var4[var7] = (char)var13;
                     var7++;
                     var5++;
                     continue;
                  }

                  var7 = this.n5(var13, var4, var7, false);
                  var5++;
                  continue;
            }

            var5++;
         }
      }
   }

   protected final void n5(String var1, int var2) {
      if (var1.length() == 0) {
         if (this.t2 >= this.e2) {
            this.ab_();
         }
      } else {
         char[] var3 = com.aspose.slides.ms.System.d1.c8(var1);
         byte var4 = 0;
         int var5 = var4;
         int var6 = var4 + var1.length();
         char[] var7 = this.z3;
         byte var8 = 0;
         int var9 = var8 + this.t2;
         char var15 = 0;

         while (true) {
            int var11 = var9 + (var6 - var5);
            if (var11 > var8 + this.e2) {
               var11 = var8 + this.e2;
            }

            while (var9 < var11 && (this.c8.n5[var15 = var3[var5]] & 255 & 64) != 0 && var15 != var2) {
               var7[var9] = (char)var15;
               var9++;
               var5++;
            }

            if (var5 >= var6) {
               this.t2 = var9 - var8;
               return;
            }

            if (var9 >= var11) {
               this.t2 = var9 - var8;
               this.ab_();
               var9 = var8 + 1;
            } else {
               switch (var15) {
                  case '\t':
                  case '&':
                  case '<':
                     var7[var9] = (char)var15;
                     var9++;
                     break;
                  case '\n':
                     if (this.j5 == 0) {
                        var9 = this.l6(var9);
                     } else {
                        var7[var9] = (char)var15;
                        var9++;
                     }
                     break;
                  case '\r':
                     if (this.j5 == 0) {
                        try {
                           if (var3[var5 + 1] == '\n') {
                              var5++;
                           }
                        } catch (IndexOutOfRangeException var13) {
                        } catch (ArrayIndexOutOfBoundsException var14) {
                        }

                        var9 = this.l6(var9);
                     } else {
                        var7[var9] = (char)var15;
                        var9++;
                     }
                     break;
                  case '-':
                     var7[var9] = '-';
                     var9++;
                     if (var15 == var2 && (var5 + 1 == var6 || var3[var5 + 1] == '-')) {
                        var7[var9] = ' ';
                        var9++;
                     }
                     break;
                  case '?':
                     var7[var9] = '?';
                     var9++;
                     if (var15 == var2 && var5 + 1 < var6 && var3[var5 + 1] == '>') {
                        var7[var9] = ' ';
                        var9++;
                     }
                     break;
                  case ']':
                     var7[var9] = ']';
                     var9++;
                     break;
                  default:
                     if (u4.k5((int)var15)) {
                        var9 = n5(var3, var5, var6, var7, var9);
                        var5 += 2;
                        continue;
                     }

                     if (var15 > 127 && var15 < '\ufffe') {
                        var7[var9] = (char)var15;
                        var9++;
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
            this.ab_();
         }
      } else {
         char[] var2 = com.aspose.slides.ms.System.d1.c8(var1);
         byte var3 = 0;
         int var4 = var3;
         int var5 = var3 + var1.length();
         char[] var6 = this.z3;
         byte var7 = 0;
         int var8 = var7 + this.t2;
         char var15 = 0;

         while (true) {
            int var10 = var8 + (var5 - var4);
            if (var10 > var7 + this.e2) {
               var10 = var7 + this.e2;
            }

            while (var8 < var10 && (this.c8.n5[var15 = var2[var4]] & 255 & 128) != 0 && var15 != ']') {
               var6[var8] = (char)var15;
               var8++;
               var4++;
            }

            if (var4 >= var5) {
               this.t2 = var8 - var7;
               return;
            }

            if (var8 >= var10) {
               this.t2 = var8 - var7;
               this.ab_();
               var8 = var7 + 1;
            } else {
               switch (var15) {
                  case '\t':
                  case '"':
                  case '&':
                  case '\'':
                  case '<':
                     var6[var8] = (char)var15;
                     var8++;
                     break;
                  case '\n':
                     if (this.j5 == 0) {
                        var8 = this.l6(var8);
                     } else {
                        var6[var8] = (char)var15;
                        var8++;
                     }
                     break;
                  case '\r':
                     if (this.j5 == 0) {
                        try {
                           if (var2[var4 + 1] == '\n') {
                              var4++;
                           }
                        } catch (IndexOutOfRangeException var12) {
                        } catch (ArrayIndexOutOfBoundsException var13) {
                        }

                        var8 = this.l6(var8);
                     } else {
                        var6[var8] = (char)var15;
                        var8++;
                     }
                     break;
                  case '>':
                     if (this.z1 && var6[var8 - 1] == ']') {
                        var8 = x8(var6, var8);
                        var8 = s7(var6, var8);
                     }

                     var6[var8] = '>';
                     var8++;
                     break;
                  case ']':
                     if (var6[var8 - 1] == ']') {
                        this.z1 = true;
                     } else {
                        this.z1 = false;
                     }

                     var6[var8] = ']';
                     var8++;
                     break;
                  default:
                     if (u4.k5((int)var15)) {
                        var8 = n5(var2, var4, var5, var6, var8);
                        var4 += 2;
                        continue;
                     }

                     if (var15 > 127 && var15 < '\ufffe') {
                        var6[var8] = (char)var15;
                        var8++;
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

   private static int n5(char[] var0, int var1, int var2, char[] var3, int var4) {
      char var5 = var0[var1];
      if (var5 <= '\udbff') {
         if (var1 + 1 < var2) {
            char var6 = var0[var1 + 1];
            if (var6 >= '\udc00' && var6 <= '\udfff') {
               var3[var4] = (char)var5;
               var3[var4 + 1] = (char)var6;
               return var4 + 2;
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

   private int n5(int var1, char[] var2, int var3, boolean var4) {
      if (this.y2) {
         throw f4.l6((char)var1, (char)0);
      }

      if (var4) {
         return n5(var2, var3, (char)var1);
      }

      var2[var3] = (char)var1;
      return var3 + 1;
   }

   public final void n5(char[] var1, int[] var2, int var3, char[] var4, int[] var5) {
      char var6 = var1[var2[0]];
      if (u4.k5((int)var6)) {
         var5[0] = n5(var1, var2[0], var3, var4, var5[0]);
         var2[0] += 2;
      } else if (var6 > 127 && var6 < '\ufffe') {
         var4[var5[0]] = (char)var6;
         var5[0]++;
         var2[0]++;
      } else {
         var5[0] = this.n5(var6, var4, var5[0], false);
         var2[0]++;
      }
   }

   protected final void n5(boolean var1) {
      this.z8 = var1;
      if (this.n5 + 1 == this.l6.length) {
         this.y4();
      }

      this.l6[++this.n5] = this.t2;
   }

   private void y4() {
      int[] var1 = new int[this.l6.length * 2];
      com.aspose.slides.ms.System.u3.n5(com.aspose.slides.ms.System.u3.n5((Object)(this.l6)), com.aspose.slides.ms.System.u3.n5((Object)(var1)), this.l6.length);
      this.l6 = var1;
   }

   protected final int l6(int var1) {
      byte var2 = 0;
      this.t2 = var1 - var2;
      this.s7(this.c4);
      return var2 + this.t2;
   }

   protected static int k5(char[] var0, int var1) {
      var0[var1] = '&';
      var0[var1 + 1] = 'l';
      var0[var1 + 2] = 't';
      var0[var1 + 3] = ';';
      return var1 + 4;
   }

   protected static int u3(char[] var0, int var1) {
      var0[var1] = '&';
      var0[var1 + 1] = 'g';
      var0[var1 + 2] = 't';
      var0[var1 + 3] = ';';
      return var1 + 4;
   }

   protected static int a6(char[] var0, int var1) {
      var0[var1] = '&';
      var0[var1 + 1] = 'a';
      var0[var1 + 2] = 'm';
      var0[var1 + 3] = 'p';
      var0[var1 + 4] = ';';
      return var1 + 5;
   }

   protected static int u9(char[] var0, int var1) {
      var0[var1] = '&';
      var0[var1 + 1] = 'q';
      var0[var1 + 2] = 'u';
      var0[var1 + 3] = 'o';
      var0[var1 + 4] = 't';
      var0[var1 + 5] = ';';
      return var1 + 6;
   }

   protected static int h0(char[] var0, int var1) {
      var0[var1] = '&';
      var0[var1 + 1] = '#';
      var0[var1 + 2] = 'x';
      var0[var1 + 3] = '9';
      var0[var1 + 4] = ';';
      return var1 + 5;
   }

   protected static int c8(char[] var0, int var1) {
      var0[var1] = '&';
      var0[var1 + 1] = '#';
      var0[var1 + 2] = 'x';
      var0[var1 + 3] = 'A';
      var0[var1 + 4] = ';';
      return var1 + 5;
   }

   protected static int t2(char[] var0, int var1) {
      var0[var1] = '&';
      var0[var1 + 1] = '#';
      var0[var1 + 2] = 'x';
      var0[var1 + 3] = 'D';
      var0[var1 + 4] = ';';
      return var1 + 5;
   }

   private static int n5(char[] var0, int var1, char var2) {
      String var3 = com.aspose.slides.ms.System.a3.n5(var2, "X", com.aspose.slides.internal.x7n.s7.x8());
      var0[var1] = '&';
      var0[var1 + 1] = '#';
      var0[var1 + 2] = 'x';
      var1 += 3;
      char[] var4 = com.aspose.slides.ms.System.d1.c8(var3);
      int var5 = 0;

      try {
         while (var0[var1++] == var4[var5++]) {
         }
      } catch (IndexOutOfRangeException var7) {
      } catch (ArrayIndexOutOfBoundsException var8) {
      }

      var0[var1 - 1] = ';';
      return var1;
   }

   protected static int s7(char[] var0, int var1) {
      var0[var1] = '<';
      var0[var1 + 1] = '!';
      var0[var1 + 2] = '[';
      var0[var1 + 3] = 'C';
      var0[var1 + 4] = 'D';
      var0[var1 + 5] = 'A';
      var0[var1 + 6] = 'T';
      var0[var1 + 7] = 'A';
      var0[var1 + 8] = '[';
      return var1 + 9;
   }

   protected static int x8(char[] var0, int var1) {
      var0[var1 + 0] = ']';
      var0[var1 + 1] = ']';
      var0[var1 + 2] = '>';
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
