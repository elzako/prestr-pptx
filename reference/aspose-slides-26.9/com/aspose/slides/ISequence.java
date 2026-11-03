package com.aspose.slides;

import com.aspose.slides.Collections.Generic.IGenericEnumerable;

public interface ISequence extends IGenericEnumerable<IEffect> {
   int getCount();

   void remove(IEffect var1);

   void removeAt(int var1);

   void clear();

   IEffect get_Item(int var1);

   IShape getTriggerShape();

   void setTriggerShape(IShape var1);

   void removeByShape(IShape var1);

   IEffect[] getEffectsByShape(IShape var1);

   IEffect[] getEffectsByParagraph(IParagraph var1);

   int getCount(IShape var1);

   IEffect addEffect(IShape var1, int var2, int var3, int var4);

   IEffect addEffect(IParagraph var1, int var2, int var3, int var4);

   IEffect addEffect(IChart var1, int var2, int var3, int var4, int var5, int var6);

   IEffect addEffect(IChart var1, int var2, int var3, int var4, int var5, int var6, int var7);
}
