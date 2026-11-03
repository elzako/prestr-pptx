package com.aspose.slides;

public class TextParam$FontArgs extends com.aspose.slides.internal.v6g.h0<TextParam$FontArgs> {
   public String Name;
   public float Height;
   public boolean Bold;
   public boolean Italic;
   public boolean Underline;

   public final void set(c9g portionFormatEffective, String defaultFontName) {
      if (portionFormatEffective != null) {
         if (com.aspose.slides.ms.System.n1.k5(this.Height)) {
            this.Height = portionFormatEffective.h0();
         }

         this.Bold = portionFormatEffective.getFontBold();
         this.Italic = portionFormatEffective.getFontItalic();
      }

      if (defaultFontName == null && "arial black".equals(com.aspose.slides.ms.System.d1.u9(this.Name))) {
         this.Bold = false;
      }
   }

   public void CloneTo(TextParam$FontArgs that) {
      that.Name = this.Name;
      that.Height = this.Height;
      that.Bold = this.Bold;
      that.Italic = this.Italic;
      that.Underline = this.Underline;
   }

   public TextParam$FontArgs Clone() {
      TextParam$FontArgs var1 = new TextParam$FontArgs();
      this.CloneTo(var1);
      return var1;
   }

   @Override
   public Object clone() {
      return this.Clone();
   }

   private boolean n5(TextParam$FontArgs var1) {
      return com.aspose.slides.ms.System.j8.n5(var1.Name, this.Name)
         && var1.Height == this.Height
         && var1.Bold == this.Bold
         && var1.Italic == this.Italic
         && var1.Underline == this.Underline;
   }

   @Override
   public int hashCode() {
      return com.aspose.slides.internal.n2d.q0.n5(this.Name, this.Height, this.Bold, this.Italic, this.Underline);
   }

   @Override
   public boolean equals(Object obj) {
      if (com.aspose.slides.ms.System.j8.l6(null, obj)) {
         return false;
      } else if (com.aspose.slides.ms.System.j8.l6(this, obj)) {
         return true;
      } else {
         return !(obj instanceof TextParam$FontArgs) ? false : this.n5((TextParam$FontArgs)obj);
      }
   }

   public static boolean equals(TextParam$FontArgs obj1, TextParam$FontArgs obj2) {
      return obj1.equals(obj2);
   }
}
