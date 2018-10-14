# CustomAnimationAndDesign
## Import
```
allprojects {
		repositories {
			...
			maven { url 'https://jitpack.io' }
		}
	}
  ```
  ```
  dependencies {
	        implementation 'com.github.AnkanHalder:CustomAnimationAndDesign:1.0'
	}
  ```

## Recycler Animation
---
### Animation Left to Right
<a href="https://imgflip.com/gif/2k31vp"><img src="https://i.imgflip.com/2k31vp.gif" title="made at imgflip.com"/></a>
### Use
```
AnimationUtils.slide_left_to_right(viewHolder);//Pass the ViewHolder Object
```

### Example
```java
@Override
    public void onBindViewHolder(@NonNull ViewHolder viewHolder, int i) {
        GetterSetter getset = getterSetters.get(i);
        viewHolder.textView.setText(getset.getSongName());
        viewHolder.imageView.setImageResource(getset.getResource());
        AnimationUtils.slide_left_to_right(viewHolder);	
    }
```

### Animation Right to Left
<a href="https://imgflip.com/gif/2k30mf"><img src="https://i.imgflip.com/2k30mf.gif" title="made at imgflip.com"/></a>
### Use
```
AnimationUtils.slide_right_to_left(viewHolder);//Pass the ViewHolder Object
```

### Example
```java
@Override
    public void onBindViewHolder(@NonNull ViewHolder viewHolder, int i) {
        GetterSetter getset = getterSetters.get(i);
        viewHolder.textView.setText(getset.getSongName());
        viewHolder.imageView.setImageResource(getset.getResource());
        AnimationUtils.slide_right_to_left(viewHolder);	
    }
```
